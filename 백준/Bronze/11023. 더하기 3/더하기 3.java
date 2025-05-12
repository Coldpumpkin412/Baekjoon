import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
        
		int count = st.countTokens();
        
		int sum = 0;
		
		while(count-->0) {
			sum += Integer.parseInt(st.nextToken());
		}
		
		System.out.println(sum);
	}

}