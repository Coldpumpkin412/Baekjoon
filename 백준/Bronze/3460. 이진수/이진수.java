import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());

		for(int i=0 ; i<T ; i++){ 
			int N = Integer.parseInt(br.readLine()); 

			int index = 0; 

			while(N > 0) { 
				if(N%2 == 1) { 
					System.out.print(index + " ");
				}
				N /= 2; 
				index++; 
				
			}
            
			System.out.println(); 
		}
	}
}