/*
 * AOAPC I: Beginning Algorithm Contests :: Volume 1. Elementary Problem Solving :: Big Number
 */
package volume1.bignumber;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Scanner;

/**
 * Problem 748 - Exponentiation
 * 
 * Use string to represent this big numbers.
 * Or you can use BigNumber!
 * 
 * Problem Link:
 * http://uva.onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&category=97&page=show_problem&problem=689
 * 
 * @author Loiane Groner
 * http://loiane.com
 * http://loianegroner.com
 */
public class P748 {
	
	public static void main(String[] args) throws IOException 
	{
		BigDecimal num1;
		BigDecimal n = new BigDecimal("0");
		int num2, compare;
		String line;
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext())
		{
			num1 = new BigDecimal(sc.next());
			num2 = Integer.parseInt(sc.next());
			num1 = num1.pow(num2);
			
			compare = n.compareTo(num1);
			
			if (compare == 0){
				System.out.println(".");
			} else 
			{	
				line = num1.toPlainString();
				if (line.indexOf(".") < 0){
					line += ".";
				}
				line = removeZerosFromStart(line);
				line = removeZerosFromEnd(line);
				System.out.println(line);
			}
		}
	}
	
	public static String removeZerosFromEnd (String num)
	{
		int count = num.length()-1;
		while ((num.charAt(count) == '0') && (count >= 0)){
			count--;
		}
		if (count != (num.length()-1)){
			return num.substring(0, count+1);
		}
		return num;
	}
	
	public static String removeZerosFromStart (String num)
	{
		int pos = num.indexOf(".");
		int count = 0;
		while ((num.charAt(count) == '0') && (count < pos)){
			count++;
		}
		if (count != 0){
			return num.substring(count);
		}
		return num;
	}

}
