import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
		int T = Integer.parseInt(br.readLine());
		
		while(T-->0) {
			int D = Integer.parseInt(br.readLine());
            
			int max = 1;
            
			while(max + (max*max) <= D) {
				max++;
			}
			System.out.println((max-1));
		}
	}

}