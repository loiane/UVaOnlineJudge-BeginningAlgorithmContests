/*
 * AOAPC I: Beginning Algorithm Contests :: Volume 0. Getting Started
 */
package volume0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Problem 490 - Rotating Sentences
 * 
 * the easiest way to solve is to store the sentences
 * in an array, and then re-print them all using the desired orientation
 * 
 * Problem Link:
 * http://uva.onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&category=94&page=show_problem&problem=431
 * 
 * @author Loiane Groner
 * http://loiane.com
 * http://loianegroner.com
 */
public class P490 {
	
	public static void main(String[] args) throws IOException 
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<String> list = new ArrayList<String>();
		StringBuffer sb = new StringBuffer();
		String line;
		int max = 0;
		while ((line = in.readLine()) != null)
		{
			list.add(line);
			if (line.length() > max)
				max = line.length();
		}
		
		for (int m=0; m<max; m++){
			for (int i=list.size()-1; i>=0; i--){
				line = list.get(i);
				if (line.length() > m){
					sb.append(line.charAt(m));
				} else{
					sb.append(" ");
				}
			}
			System.out.println(sb.toString());
			sb.delete(0, sb.length());
		}
	}
}
