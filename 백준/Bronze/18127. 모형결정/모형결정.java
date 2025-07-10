import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
        st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken());
		long B = Long.parseLong(st.nextToken());
		
		long answer = 0;
		long num = 1;
        
		while(B-->-1) {
			answer += num;
			num += (A-2);
		}
		System.out.print(answer);
	}
}