import java.util.*;
import java.io.*;

public class Main {
 	public static void main(String arg[]) throws IOException {
 		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        //N 입력
 		int N = Integer.parseInt(br.readLine());
        
 		if(N <= 9) {
 			System.out.println(1);
 		}else {
 			int nine = N/18 * 2;
 			N %= 18;
            
 			if(N == 0) {
 				System.out.println(nine);
 			}else {
 				if(N < 10) {
 					System.out.println(nine+1);
 				}else if(N%2 == 1) {
 					System.out.println(nine+3);
 				}else {
 					System.out.println(nine+2);
 				}
 			}
 		}
 	}
}