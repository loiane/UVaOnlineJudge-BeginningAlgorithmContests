/*
 * AOAPC I: Beginning Algorithm Contests :: Volume 1. Elementary Problem Solving :: Big Number
 */
package volume1.bignumber;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

/**
 * Problem 10494 - If We Were a Child Again
 * 
 * A good problem to test your elementary school mathematics.
 * Just simulate your elementary school mathematics (use String as your data structure)
 * Or you can use BigNumber!
 * 
 * Problem Link:
 * http://uva.onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&category=97&page=show_problem&problem=1435
 * 
 * @author Loiane Groner
 * http://loiane.com
 * http://loianegroner.com
 */
public class P10494 {

	public static void main(String[] args) throws IOException 
	{
		BigInteger num1, num2;
		String op;
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext())
		{
			num1 = new BigInteger(sc.next());
			op = sc.next();
			num2 = new BigInteger(sc.next());
			
			if (op.equals("/")){
				System.out.println(num1.divide(num2).toString());
			} else if (op.equals("%")){
				System.out.println(num1.mod(num2).toString());
			}
		}
	}
}
