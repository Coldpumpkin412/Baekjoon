import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
		int T = Integer.parseInt(br.readLine());
		
		while(T-->0) {
			st = new StringTokenizer(br.readLine());
			int count = st.countTokens();
			int sum = 0;
			
			for(int i=0 ; i<count ; i++) {
				sum += Integer.parseInt(st.nextToken());
			}
			
			System.out.println(sum);
		}
	}

}