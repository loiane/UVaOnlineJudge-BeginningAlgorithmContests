/*
 * AOAPC I: Beginning Algorithm Contests :: Volume 1. Elementary Problem Solving :: String
 */
package volume1.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Problem 10010 - Where's Waldorf?
 * 
 * Read the input into 2 dimensional array. Then check all coordinate
 * (from uppermost+leftmost) and all 8 directions (N,NE,E,SE,S,SW,W,NW)
 * for the desired word.
 * 
 * Problem Link:
 * http://uva.onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&category=96&page=show_problem&problem=951
 * 
 * @author Loiane Groner
 * http://loiane.com
 * http://loianegroner.com
 */
public class P10010 {

	static char[][] board = new char[52][52];
	static char i,j,words;
	static char[] word = new char[250];
	static int len, cases, m,n;
	static boolean found;
	static String[] aux;

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		cases = Integer.parseInt(bf.readLine());
		bf.readLine();
		while((cases--) > 0){
			
			aux = bf.readLine().split(" ");
			m = Integer.parseInt(aux[0]);
			n = Integer.parseInt(aux[1]);
			
			for(i = 0; i < m+2; i++) board[i][0] = '-';
			for(j = 0; j < n+2; j++) board[0][j] = board[m+1][j] = '-';
			for(i = 1; i <= m; i++) board[i] = bf.readLine().toCharArray();
			for(i = 0; i < m+2; i++) board[i][n+1] = '-';
			for(i = 1; i <= m; i++)
				for(j = 1; j <= n; j++)
					if(board[i][j] > 64 && board[i][j] < 91) board[i][j] +=32;
			
			while((words--) > 0){
				word = bf.readLine().toCharArray();
				found = false;
				len = word.length;
				for(j = 0; word[j] != '\0'; j++) if(word[j] > 64 && word[j] < 91) word[j] +=32;
				search();
			}
			if(cases > 0) System.out.print('\n');
		}


	}

	static void recSearch(int xo,int yo, int px, int py, int ax,int ay, int k){
		if(k == len) {
			System.out.printf("%d %d\n",xo,yo,word);
			found = true;
			return;
		}
		if(board[xo+ax][yo+ay] != word[k]) return;
		
		recSearch(xo,yo,px,py,ax+px,ay+py,k+1);
	}

	static void search(){
		char x,y;
		for(x = 1; x <= m; x++)
			for(y = 1; y <= n; y++)
				if(board[x][y] == word[0]){
					recSearch(x,y,0,1,0,1,1); // right
					if(!found) recSearch(x,y,1,0,1,0,1); // down
					if(!found) recSearch(x,y,0,-1,0,-1,1);// left
					if(!found) recSearch(x,y,-1,0,-1,0,1);// up
					if(!found) recSearch(x,y,1,1,1,1,1); // right down
					if(!found) recSearch(x,y,-1,1,-1,1,1); // right up
					if(!found) recSearch(x,y,1,-1,1,-1,1); // left down
					if(!found) recSearch(x,y,-1,-1,-1,-1,1); // left up
					if(found) return;
				}
	}

	

}
