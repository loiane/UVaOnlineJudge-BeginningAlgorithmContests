/*
 * AOAPC I: Beginning Algorithm Contests :: Volume 1. Elementary Problem Solving :: String
 */
package volume1.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Problem 10361 - Automatic Poetry
 * 
 * Read the input pairs, tokenize first line into 5 strings s1,s2,s3,s4,s5,
 * then print this first line as usual, but without '<' or '>'.
 * For the second line, print the original up to '...', then print s4,s3,s2,s5.
 * 
 * Problem Link:
 * http://uva.onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&category=96&page=show_problem&problem=1302
 * 
 * @author Loiane Groner
 * http://loiane.com
 * http://loianegroner.com
 */
public class P10361 {
	
	public static void main(String[] args) throws IOException 
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String line, s1, s2, s3, s4, s5;
		int totalCases = Integer.parseInt(in.readLine());
		int pos1, pos2, pos3 , pos4;
		for (int i=0; i<totalCases; i++)
		{
			line = in.readLine();
			pos1 = line.indexOf("<");
			pos2 = line.indexOf(">", pos1);
			s1 = line.substring(0, pos1);
			s2 = line.substring(pos1+1, pos2);
			
			pos3 = line.indexOf("<", pos2);
			pos4 = line.indexOf(">", pos3);
			s3 = line.substring(pos2+1, pos3);
			s4 = line.substring(pos3+1, pos4);
			s5 = line.substring(pos4+1);
			
			line = in.readLine();
			
			System.out.println(s1+s2+s3+s4+s5);
			System.out.println(line.replace("...", s4+s3+s2+s5));
		}
			
	}
}
