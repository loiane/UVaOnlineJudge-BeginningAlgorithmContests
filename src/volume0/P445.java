/*
 * AOAPC I: Beginning Algorithm Contests :: Volume 0. Getting Started
 */
package volume0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Problem 445 - Marvelous Mazes
 * 
 * You only have to do what this problem wants you to do, i.e:
 * Read one character per character…
 * If you encounter ‘b’, print space
 * If you encounter ‘!’, print line break (change line)
 * else, print that character
 * 
 * Problem Link:
 * http://uva.onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&category=94&page=show_problem&problem=386
 * 
 * @author Loiane Groner
 * http://loiane.com
 * http://loianegroner.com
 */
public class P445 {
	
	public static void main(String[] args) throws IOException 
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String numbers = "0123456789";
		int num;
		char c;
		while ((line = in.readLine()) != null)
		{
			if (line.equals("")){
				System.out.println();
				num=0;
				continue;
			}
			num=0;
			for(int i=0; i<line.length(); i++){
				c = line.charAt(i);
				if (numbers.indexOf(c) > 0){
					num += Integer.parseInt(""+c);
				} else if (c == '!'){
					System.out.println();
					num=0;
				} else if (c == 'b'){
					for (int j=0; j<num; j++){
						System.out.print(' ');
					}
					num=0;
				} else{
					for (int j=0; j<num; j++){
						System.out.print(c);
					}
					num=0;
				}
			}
			System.out.println();
		}
	}
}
