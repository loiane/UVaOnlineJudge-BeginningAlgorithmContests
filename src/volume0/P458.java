/*
 * AOAPC I: Beginning Algorithm Contests :: Volume 0. Getting Started
 */
package volume0;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.IOException;

/**
 * Problem 458 - The Decoder
 * 
 * Just shift each character ASCII Codes 7 characters down. (7 is perfect number)
 * 
 * Problem Link:
 * http://uva.onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&category=94&page=show_problem&problem=399
 * 
 * @author Loiane Groner
 * http://loiane.com
 * http://loianegroner.com
 */
public class P458 {
	
	public static void main(String[] args) throws IOException {
        DataInputStream in = new DataInputStream(System.in);
        DataOutputStream output = new DataOutputStream(System.out) ;
        byte ch;
        try {
            while (true) {
              ch = in.readByte();
              if (ch != 10 && ch != 13)
            	  ch = (byte)(ch - 7);
              output.writeByte(ch);
              output.flush();
            }
          } catch (EOFException eof) {}
	}
}
