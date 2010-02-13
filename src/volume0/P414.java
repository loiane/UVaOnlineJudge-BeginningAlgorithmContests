/*
 * AOAPC I: Beginning Algorithm Contests :: Volume 0. Getting Started
 */
package volume0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Problem 414 - Machined Surfaces
 * 
 * Straightforward... just simulate the process,
 * count the number of blanks after that.
 * 
 * Problem Link:
 * http://uva.onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&category=94&page=show_problem&problem=355
 * 
 * @author Loiane Groner
 * http://loiane.com
 * http://loianegroner.com
 */
public class P414 {
	
	public static void main(String[] args) throws IOException 
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String line;
		int n, min_blanks, total, i, j, k;
		while ((line = in.readLine()) != null)
		{
			n = Integer.parseInt(line);
			
			if (n == 0)
				System.exit(0);
			
			min_blanks = 23;
			total = 0;
			for(i=0; i<n; i++)
			{
				line = in.readLine();
				for (j=0; j<25 ; j++){
					if (line.charAt(j) != 'X')
						break;
				}
				for (k=24; k>=j ; k--){
					if (line.charAt(k) != 'X')
						break;
				}
				total += (k-j+1);
				if (k+1-j < min_blanks)
					min_blanks = k-j+1;
			}
			total -= min_blanks*n;
			System.out.println(total);

		}
	}
}
