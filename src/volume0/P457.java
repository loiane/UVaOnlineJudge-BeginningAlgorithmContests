/*
 * AOAPC I: Beginning Algorithm Contests :: Volume 0. Getting Started
 */
package volume0;

import java.io.IOException;
import java.util.Scanner;

/**
 * Problem 457 - Linear Cellular Automata
 * 
 * Just simulate this according to their rules. This problem is called a 'game of life' in Biology.
 * 
 * Problem Link:
 * http://uva.onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&category=94&page=show_problem&problem=398
 * 
 * @author Loiane Groner
 * http://loiane.com
 * http://loianegroner.com
 */
public class P457 {
	
	public static void main(String[] args) throws IOException 
	{
		Scanner sc = new Scanner(System.in);
		final char[] den = {' ','.','x','W'};
		int[] DNA = new int[10];
		int[] current, next;
		int tests = sc.nextInt();
		int i, j, k;
		for (int test=0; test<tests; test++)
		{
			for (i=0; i<10; i++){
				DNA[i] = sc.nextInt();
			}
			
			current = new int[40];
			current[19] = 1;
			
			for (i=0; i<50; i++)
			{
				next = new int[40];
				
				for (j=0; j<40; j++){
					System.out.print(den[current[j]]);
				}
				System.out.println();
				for (j=1; j<39; j++){
					k = current[j] + current[j-1] + current[j+1];
					next[j] = DNA[k];
				}
				next[0] = DNA[current[0] + current[1]];
				next[39] = DNA[current[38] + current[39]];
				current = next.clone();
			}
			if (test < tests-1){
				System.out.println();
			}
		}
	}	
}
