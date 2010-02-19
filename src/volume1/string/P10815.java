/*
 * AOAPC I: Beginning Algorithm Contests :: Volume 1. Elementary Problem Solving :: String
 */
package volume1.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

/**
 * Problem 10815 - Andy's First Dictionary
 * 
 * Simple string processing problem. Tokenize each word (word is defined as
 * sequences of a-z/A-Z  only!), lowercase them, and then hash them to a good
 * hashtable (in C++, use STL map). Finally, output the strings in sorted order.
 * 
 * Problem Link:
 * http://uva.onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&category=96&page=show_problem&problem=1756
 * 
 * @author Loiane Groner
 * http://loiane.com
 * http://loianegroner.com
 */
public class P10815 {
	
	public static void main(String[] args) throws IOException 
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String line, aux;
		HashSet<String> dictionary = new HashSet<String>();
		ArrayList<String> list = new ArrayList<String>();
		int i;
		while ((line = in.readLine()) != null)
		{
			aux = "";
			for (i=0; i<line.length(); i++)
			{
				if (Character.isLetter(line.charAt(i))){
					aux += line.charAt(i);
				}else{
					aux = aux.toLowerCase();
					if (aux.length() > 0){
						dictionary.add(aux);
					}
					aux = "";
				}
			}
			if (aux.length()> 0){
				aux = aux.toLowerCase();
				dictionary.add(aux);
			}
		}
		list.addAll(dictionary);
		Collections.sort(list);
		for (i=0; i<list.size(); i++){
			System.out.println(list.get(i));
		}
	}
}
