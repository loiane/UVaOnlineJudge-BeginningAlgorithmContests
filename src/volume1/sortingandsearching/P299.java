/*
 * AOAPC I: Beginning Algorithm Contests :: Volume 1. Elementary Problem Solving :: Sorting/Searching
 */
package volume1.sortingandsearching;

import java.io.IOException;
import java.util.Scanner;

/**
 * Problem 299 - Train Swapping
 * 
 * Counting the number of inversions simply counts the number of swaps it takes in sorting,
 * which is straightforward for bubble sort - increment a counter everytime
 * you swap two adjacent items.
 * 
 * Problem Link:
 * http://uva.onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&category=98&page=show_problem&problem=235
 * 
 * @author Loiane Groner
 * http://loiane.com
 * http://loianegroner.com
 */
public class P299 {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		int l, s;
		int[] array;
		for (int c=0; c<cases; c++){
			
			l = sc.nextInt();
			array = new int[l];
			for (int a=0; a<l; a++){
				array[a] = sc.nextInt();
			}
			s = bubbleSort(array);
			System.out.println("Optimal train swapping takes "+s+" swaps.");
		}
	}

	static int bubbleSort (int[] array){
		int swaps = 0;
		int s = 0;
		int temp;
		for (int i=0; i<array.length-1; i++){
			swaps = 0;
			for (int j=0; j<array.length-1-i; j++){
				if (array[j] > array[j + 1]){
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
					swaps++;
					s++;
				}
			}
			if (swaps == 0){
				break;
			}
		}
		return s;
	}
}
