/*
 * AOAPC I: Beginning Algorithm Contests :: Volume 0. Getting Started
 */
package volume0;

import java.io.IOException;
import java.util.Scanner;

/**
 * Problem 488 - Triangle Wave
 * 
 * Input Amplitude and Frequencies
 * Then do nested loops, the outer loop is for frequencies…
 * Inside outer loop, do an increasing loop and a decreasing loop to print the Wave.
 * 
 * Problem Link:
 * http://uva.onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&category=94&page=show_problem&problem=429
 * 
 * @author Loiane Groner
 * http://loiane.com
 * http://loianegroner.com
 */
public class P488 {
	
	public static void main(String[] args) throws IOException 
	{
		Scanner sc = new Scanner(System.in);
		int tests = sc.nextInt();
		int a, f;
		
		String[] amplitude = {"","1","22","333","4444","55555",
				"666666","7777777","88888888","999999999"};
		
		StringBuffer sb;
		
		for (int test=0; test<tests; test++)
		{
			a = sc.nextInt();
			f = sc.nextInt();
			
			if (a == 0){
				for (int i=1;i<f;i++){
					System.out.println();
				}
				continue;
			}
			
			if (f == 0)
			{
				System.out.println();
			} 
			else
			{
				sb = new StringBuffer();
				for (int i=1; i<=a;i++){
					sb.append(amplitude[i]);
					sb.append("\n");
				}
				for (int i=a-1; i>0;i--){
					sb.append(amplitude[i]);
					sb.append("\n");
				}
				for (int j=0; j<f; j++)
				{
					System.out.print(sb.toString());
					if(test < (tests-1)){
						System.out.println();
					} else if((test == (tests-1)) && (j <f-1)){
						System.out.println();
					}
				}
			}
			
			
		}
	}
}
