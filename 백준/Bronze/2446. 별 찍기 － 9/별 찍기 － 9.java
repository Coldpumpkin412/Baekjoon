import java.util.*;
import java.io.*;
 
public class Main {
 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
		int N = Integer.parseInt(br.readLine());
 
		for(int i=0 ; i<N ; i++) {
            
			for(int j=0 ; j<i ; j++) {
				System.out.print(" ");
			}
 
			for(int j=0 ; j<(2*N-1) - (2*i) ; j++) {
				System.out.print("*");
			}
 
			System.out.println();
		}
 
		for(int i=0 ; i<N-1 ; i++) {
        
			for (int j=1 ; j<(N-1)-i ; j++) {	
				System.out.print(" ");
			}
 
			for(int j=0 ; j<2*i + 3 ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
 
}
 