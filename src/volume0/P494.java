/*
 * AOAPC I: Beginning Algorithm Contests :: Volume 0. Getting Started
 */
package volume0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Problem 494 - Kindergarten Counting Game
 * 
 * Given a line containing multiple words (at least one),
 * you must determine how many words are there in that line.
 * Just think about the way to tokenize the input, and remember this:
 * A "word" is defined as a consecutive sequence of letters (upper and/or lower case).
 * 
 * Problem Link:
 * http://uva.onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&category=94&page=show_problem&problem=435
 * 
 * @author Loiane Groner
 * http://loiane.com
 * http://loianegroner.com
 */
public class P494 {
	
	public static void main(String[] args) throws IOException 
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String line;
		int i, cont, pos;
		char c;
		String p;
		while ((line = in.readLine()) != null)
		{
			cont = 0;
			pos = 0;
			for (i=0; i<line.length();i++)
			{
				c = line.charAt(i);
				if(!((c >= 97 && c<= 122) || (c >= 65 && c<= 90))){
					 p = line.substring(pos, i);
					 if (p != null && !p.equals("")){
						 cont++;
					 }
					 pos = i +1;
				} 
			}
			if (pos < line.length())
				cont++;
			System.out.println(cont);
		}
	}
}
