/*
 * AOAPC I: Beginning Algorithm Contests :: Volume 1. Elementary Problem Solving :: Big Number
 */
package volume1.bignumber;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

/**
 * Problem 465 - Overflow
 * 
 * Use string to represent this big numbers.
 * Or you can use BigNumber!
 * 
 * Problem Link:
 * http://uva.onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&category=97&page=show_problem&problem=406
 * 
 * @author Loiane Groner
 * http://loiane.com
 * http://loianegroner.com
 */
public class P465 {

	public static void main(String[] args) throws IOException 
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String num1, num2, line;
		String[] n;
		BigInteger n1, n2, n3;
		BigInteger limit = new BigInteger("2147483647");
		while ((line = in.readLine()) != null)
		{
			if (line.indexOf('+') > 0){
				n = line.split("\\+");
				num1 = n[0].trim();
				num2 = n[1].trim();
				n1 = new BigInteger(num1);
				n2 = new BigInteger(num2);
				n3 = n1.add(n2);
			} else{
				n = line.split("\\*");
				num1 = n[0].trim();
				num2 = n[1].trim();
				n1 = new BigInteger(num1);
				n2 = new BigInteger(num2);
				n3 = n1.multiply(n2);
			}
			
			System.out.println(line);
			if (n1.compareTo(limit) == 1){
				System.out.println("first number too big");
			}
			if (n2.compareTo(limit) == 1){
				System.out.println("second number too big");
			}
			if (n3.compareTo(limit) == 1){
				System.out.println("result too big");
			}
		}
	}
}
