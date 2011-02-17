/*
 * AOAPC I: Beginning Algorithm Contests :: Volume 1. Elementary Problem Solving :: Sorting/Searching
 */
package volume1.sortingandsearching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Problem 10420 - List of Conquests
 * 
 * This problem is a simple frequency counting. There are many ways to do this,
 * the simplest is to sort the country names (you can ignore all the girls' names...),
 * then count how many time these countries appears.
 * 
 * Problem Link:
 * http://uva.onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&category=98&page=show_problem&problem=1361
 * 
 * @author Loiane Groner
 * http://loiane.com
 * http://loianegroner.com
 */
public class P10420 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		Map<String, Integer> map = new HashMap<String, Integer>();
		String s;
		Integer count;
		int cases = Integer.parseInt(bf.readLine());
		for (int c=0; c<cases; c++){
			s = bf.readLine();
			s = s.split(" ")[0];
			count = map.get(s);
			if (count == null){
				map.put(s, 1);
			}else{
				map.put(s, ++count);
			}
		}
		List<String> list = new ArrayList<String>(map.keySet());
		Collections.sort(list);
		int c;
		
		for (String a: list){
			c = map.get(a);
			System.out.println(a + " " + c);
		}
	}
}
