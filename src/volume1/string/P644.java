/*
 * AOAPC I: Beginning Algorithm Contests :: Volume 1. Elementary Problem Solving :: String
 */
package volume1.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Problem 644 - Immediate Decodability
 * 
 * Brute force... only maximum 8 codes, each code only have
 * at max 10 bits... try all nC2 (n Choose 2) possible pairings
 * and check whether bit i and bit j is a prefix of each other...
 * total brute force...
 * 
 * Problem Link:
 * http://uva.onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&category=96&page=show_problem&problem=585
 * 
 * @author Loiane Groner
 * http://loiane.com
 * http://loianegroner.com
 */
public class P644 {

	public static void main(String[] args) throws IOException 
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String line;
		ArrayList<String> codes = new ArrayList<String>();
		int caseNum = 1;
		while ((line = in.readLine()) != null)
		{
			if (line.equals("9"))
			{
				Collections.sort(codes);
				if (isDecodable(codes)){
					System.out.println("Set "+caseNum+" is immediately decodable");
				} else{
					System.out.println("Set "+caseNum+" is not immediately decodable");
				}
				codes = new ArrayList<String>();
				caseNum++;
			}
			
			codes.add(line);
		}	
	}
	
	public static boolean isDecodable(ArrayList<String> codes)
	{
		for(int i = 0; i<codes.size()-1; i ++){
			for(int j = i+1; j<codes.size(); j ++){
				if (codes.get(i).regionMatches(0, codes.get(j), 0, codes.get(i).length())){
					return false;
				}
			}
		}
		return true;
	}
}
