/*
 * AOAPC I: Beginning Algorithm Contests :: Volume 0. Getting Started
 */
package volume0;

import java.io.IOException;
import java.util.Scanner;

/**
 * Problem 10300 - Ecological Premium
 * 
 * Compute the premium, just ignore total_animal. Very very easy. =)
 * 
 * Problem Link:
 * http://uva.onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&category=94&page=show_problem&problem=1241
 * 
 * @author Loiane Groner
 * http://loiane.com
 * http://loianegroner.com
 */
public class P10300 {
	
	public static void main(String[] args) throws IOException 
	{
		Scanner sc = new Scanner(System.in);
		int tests = sc.nextInt();
		int s, a, e, farmers, total;
		double n;
		for (int test=0; test<tests; test++)
		{
			farmers = sc.nextInt();
			total = 0;
			for (int i=0; i<farmers; i++)
			{
				s = sc.nextInt();
				a = sc.nextInt();
				e = sc.nextInt();
				n = ((double)s)/((double)a);
				n *=e;
				n *=a;
				total += Math.round(n);
			}
			System.out.println(total);
		}
	}
}
