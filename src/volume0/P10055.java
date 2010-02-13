/*
 * AOAPC I: Beginning Algorithm Contests :: Volume 0. Getting Started
 */
package volume0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Problem 10055 - Hashmat the Brave Warrior
 * 
 * Use long long data type + absolute function.
 * 
 * Problem Link:
 * http://uva.onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&category=94&page=show_problem&problem=996
 * 
 * @author Loiane Groner
 * http://loiane.com
 * http://loianegroner.com
 */
public class P10055 {
	
	public static void main(String[] args) throws IOException 
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String line;
		long n1, n2;
		String[] num;
		while ((line = in.readLine()) != null)
		{
			num = line.split(" ");
			n1 = Long.parseLong(num[0]);
			n2 = Long.parseLong(num[1]);
			System.out.println(Math.abs(n2-n1));
		}
	}
}
