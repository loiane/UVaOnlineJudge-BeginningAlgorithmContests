/*
 * AOAPC I: Beginning Algorithm Contests :: Volume 1. Elementary Problem Solving :: Sorting/Searching
 */
package volume1.sortingandsearching;

import java.io.IOException;
import java.util.Scanner;

/**
 * 340 - Master-Mind Hints
 * 
 * What we have to do is to count "strong matches" and "weak matches"
 * 
 * Problem Link:
 * http://uva.onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&category=98&page=show_problem&problem=276
 * 
 * @author Loiane Groner
 * http://loiane.com
 * http://loianegroner.com
 */
public class P340 {

	static Scanner sc = new Scanner(System.in);
	static int[] secret;
	static int[] originalSecret;
	static int [] guess;
	static int strong, weak;

	public static void main(String[] args) throws IOException {
		
		int n;
		int count = 1;
		
		while ((n = sc.nextInt()) != 0){
			
			originalSecret = new int[n];
			secret = new int[n];
			guess = new int[n];
			
			for (int a=0; a<n; a++){
				originalSecret[a] = sc.nextInt();
			}
			
			System.out.println("Game "+count+":");
			
			while (readGuess()){
				
				strong = 0;
				weak = 0;
				copyOriginalSecret();
				countStrong();
				countWeak();
				System.out.println("    ("+strong+","+weak+")");
			}
			
			count++;
		}
	}
	
	static void copyOriginalSecret(){
		
		for (int i=0; i<originalSecret.length; i++){
			secret[i] = originalSecret[i];
		}
		
	}
	
	static boolean readGuess(){
		
		for (int i=0; i<originalSecret.length; i++){
			guess[i] = sc.nextInt();
		}
		
		if (guess[0] == 0){
			return false;
		}
		return true;
	}
	
	static void countStrong(){
		
		for (int i=0; i<originalSecret.length; i++){
			if (guess[i] == secret[i]){
				strong++;
				guess[i] = 0;
				secret[i] = 0;
			}
		}
	}
	
	static void countWeak(){
		
		boolean isWeak = false;
		
		for (int i=0; i<originalSecret.length; i++){
			isWeak = false;
			if (guess[i] != 0){
				for (int j=0; j<originalSecret.length; j++){
					if (secret[j] != 0){
						if (guess[i] == secret[j]){
							weak++;
							guess[i] = 0;
							secret[j] = 0;
							isWeak = true;
						}
					}
					if (isWeak) break;
				}
			}
		}
	}
}
