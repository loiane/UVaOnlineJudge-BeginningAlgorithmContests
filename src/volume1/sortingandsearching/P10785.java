/*
 * AOAPC I: Beginning Algorithm Contests :: Volume 1. Elementary Problem Solving :: Sorting/Searching
 */
package volume1.sortingandsearching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Problem 10785 - The Mad Numerologist
 * 
 * After generating the name, just sort the string twice:
 * 1) odd position, and
 * 2) even position
 * 
 * Problem Link:
 * http://uva.onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&category=98&page=show_problem&problem=1726
 * 
 * @author Loiane Groner
 * http://loiane.com
 * http://loianegroner.com
 */
public class P10785 {

	private static final char[] VOWELS = {'A','U','E','O','I'};
	private static final char[] CONSOANTS = {'J','S','B','K','T',
		'C','L','D','M','V','N','W','F','X','G','P','Y','H','Q','Z','R'};
	private static final int MAX_V = 21;
	private static final int MAX_C = 5;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer word;
		ArrayList<Character> vowels, consoants;
		int cases = Integer.parseInt(bf.readLine());
		int size, max_v, max_c, v, c;
		for (int z=1; z<=cases; z++){
			size = Integer.parseInt(bf.readLine());
			word = new StringBuffer();
			vowels = new ArrayList<Character>();
			consoants = new ArrayList<Character>();
			max_v = max_c = v = c = 0;
			for (int s=0; s<size; s++){
				if (s%2 == 0){
					if (max_v < MAX_V){
						max_v++;
					} else{
						max_v = 1;
						v++;
						if (v == 5){
							v = 0;
						}
					}
					vowels.add(VOWELS[v]);
				} else{
					if (max_c < MAX_C){
						max_c++;
					} else{
						max_c = 1;
						c++;
						if (c == 21){
							c = 0;
						}
					}
					consoants.add(CONSOANTS[c]);
				}
			}
			Collections.sort(vowels);
			Collections.sort(consoants);
			v = c = 0;
			for (int s=0; s<size; s++){
				if (s%2 == 0){
					word.append(vowels.get(v));
					v++;
				} else{
					word.append(consoants.get(c));
					c++;
				}
			}
			System.out.println("Case " + z + ": " + word.toString());
		}
	}

}
