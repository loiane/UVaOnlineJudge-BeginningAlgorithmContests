/*
 * AOAPC I: Beginning Algorithm Contests :: Volume 1. Elementary Problem Solving :: Big Number
 */
package volume1.bignumber;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

/**
 * Problem 10106 - Product
 * 
 * A good problem to test your elementary school mathematics.
 * Just simulate your elementary school mathematics (use String as your data structure)
 * Or you can use BigNumber!
 * 
 * Problem Link:
 * http://uva.onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&category=97&page=show_problem&problem=1047
 * 
 * @author Loiane Groner
 * http://loiane.com
 * http://loianegroner.com
 */
public class P10106 {

	public static void main(String[] args) throws IOException 
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String num1, num2;
		BigInteger n1, n2;
		while ((num1 = in.readLine()) != null)
		{
			num2 = in.readLine();
			n1 = new BigInteger(num1);
			n2 = new BigInteger(num2);
			System.out.println(n1.multiply(n2).toString());
		}
	}
}
