/*
 * AOAPC I: Beginning Algorithm Contests :: Volume 1. Elementary Problem Solving :: Big Number
 */
package volume1.bignumber;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

/**
 * Problem 424 - Integer Inquiry
 * 
 * Use string to represent this big numbers and do manual addition.
 * Or you can use BigNumber!
 * 
 * Problem Link:
 * http://uva.onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&category=97&page=show_problem&problem=365
 * 
 * @author Loiane Groner
 * http://loiane.com
 * http://loianegroner.com
 */
public class P424 {

	public static void main(String[] args) throws IOException 
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String line;
		BigInteger sum = new BigInteger("0");
		while ((line = in.readLine()) != null)
		{
			sum = sum.add(new BigInteger(line));
		}
		System.out.println(sum.toString());
	}
}
