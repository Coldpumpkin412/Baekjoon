import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
		int T = Integer.parseInt(br.readLine());
		
		while(T-->0) {
			int count = 0;
            
			int N = Integer.parseInt(br.readLine());
            
			for(int i=2 ; i<=N ; i++) {
				int index = N;
                
				while(true) {
					if(index%i != 0) {
						break;
					}
					count++;
                    
					index /= i;
				}
			}
			System.out.println(count);
		}
	}
}