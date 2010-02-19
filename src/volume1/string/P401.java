/*
 * AOAPC I: Beginning Algorithm Contests :: Volume 1. Elementary Problem Solving :: String
 */
package volume1.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Problem 401 - Palindromes
 * 
 * A modified version of standard palindrome, not we are also
 * provided with a list of characters + its mirror.
 * The output format is tricky. Do not forget the '.' and the blank line!
 * 
 * Problem Link:
 * http://uva.onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&category=96&page=show_problem&problem=342
 * 
 * @author Loiane Groner
 * http://loiane.com
 * http://loianegroner.com
 */
public class P401 {
	
	public static void main(String[] args) throws IOException 
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String word, half1, half2;
		StringBuffer reverse;
		int length;
		boolean isPalindrome, isReverse; 
		char[] mirror = new char[128];
		mirror['A'] = 'A'; mirror['E'] = '3'; mirror['H'] = 'H';
		mirror['I'] = 'I'; mirror['J'] = 'L'; mirror['L'] = 'J';
		mirror['M'] = 'M'; mirror['O'] = 'O'; mirror['S'] = '2';
		mirror['T'] = 'T'; mirror['U'] = 'U'; mirror['V'] = 'V';
		mirror['W'] = 'W'; mirror['X'] = 'X'; mirror['Y'] = 'Y';
		mirror['Z'] = '5'; mirror['1'] = '1'; mirror['2'] = 'S';
		mirror['3'] = 'E'; mirror['5'] = 'Z'; mirror['8'] = '8';
		
		while ((word = in.readLine()) != null)
		{
			System.out.print(word);
			
			length = word.length();
			isPalindrome = false;
			isReverse = false;
			
			reverse = new StringBuffer(word);
			reverse = reverse.reverse();
			
			if (word.equals(reverse.toString()))
			{
				isPalindrome = true;
				
				reverse.delete(0, reverse.length());
				for (int i=0 ;i<length; i++){
					reverse.append(mirror[word.charAt(i)]);
				}
				if (word.equals(reverse.toString()))
				{
					isReverse = true;
				} 
				
				if (isReverse && isPalindrome){
					System.out.println(" -- is a mirrored palindrome.\n" 	);
				} else if (isPalindrome){
					System.out.println(" -- is a regular palindrome.\n");
				}
			} else {
				
				if (length % 2 == 0){
					length /= 2;
					half2 = word.substring(length);
				} else{
					length = ((length -1)/2) +1;
					half2 = word.substring(length-1);
				}
				half1 = word.substring(0,length);
				
				reverse.delete(0, reverse.length());
				for (int i=0 ;i<length; i++){
					reverse.append(mirror[half1.charAt(i)]);
				}
				reverse = reverse.reverse();
				if (reverse.toString().equals(half2)){
					System.out.println(" -- is a mirrored string.\n");
				} else{
					System.out.println(" -- is not a palindrome.\n");
				}
			}
		}
	}
}
