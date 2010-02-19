/*
 * AOAPC I: Beginning Algorithm Contests :: Volume 1. Elementary Problem Solving :: String
 */
package volume1.string;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Problem 10878 - Decode the tape
 * 
 * An ad-hoc problem. If we ignore the '|' and '.' character,
 * strings of the form " oo o " represent the binary form of ASCII codes
 * ('o' = 1, ' ' = 0). Simply convert the strings to ASCII codes and
 * output the corresponding characters.
 * 
 * Problem Link:
 * http://uva.onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&category=96&page=show_problem&problem=1819
 * 
 * @author Loiane Groner
 * http://loiane.com
 * http://loianegroner.com
 */
public class P10878 {

	public static void main(String[] args) throws IOException 
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		DataOutputStream out = new DataOutputStream(System.out);
		String line;
		int i;
		byte value, b;
		while ((line = in.readLine()) != null)
		{
			if (line.indexOf("_") >= 0){
				continue;
			}
			
			line = line.replace("|", "");
			line = line.replace(".", "");
			
			value = 0;
			b = 1;
			for (i=7; i>=0; i--){
				if (line.charAt(i) == 'o'){
					value += b;
				}
				b *=2;
			}
			
			out.writeByte(value);
		}	
	}
}
