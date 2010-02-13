/*
 * AOAPC I: Beginning Algorithm Contests :: Volume 0. Getting Started
 */
package volume0;

import java.io.IOException;
import java.util.Scanner;

/**
 * Problem 694 - The Collatz Sequence
 * 
 * 3n+1 again. It shouldn't be difficult, isn't it?
 * Just simulate it, counting the maximum terms computed.
 * 
 * Problem Link:
 * http://uva.onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&category=94&page=show_problem&problem=635
 * 
 * @author Loiane Groner
 * http://loiane.com
 * http://loianegroner.com
 */
public class P694 {
	
	public static void main(String[] args) throws IOException 
	{
		Scanner sc = new Scanner(System.in);
		long a, l, cont, aux, caseNumber = 0;
		while (true)
		{
			a = sc.nextLong();
			l = sc.nextLong();
			
			if (a < 0 && l < 0){
				break;
			}
			
			caseNumber++;
			
			cont = 0;
			aux = a;
			
			while (aux <= l)
			{
				if (aux == 1){
					cont++;
					break;
				}
				
				if (aux % 2 == 0){
					aux /= 2;
					cont++;
				} else{
					aux = (3 * aux) + 1;
					cont++;
				}
			}
			System.out.println("Case " + caseNumber + ": A = " +
					a + ", limit = " + l + ", number of terms = " + cont);

		}
	}
}
