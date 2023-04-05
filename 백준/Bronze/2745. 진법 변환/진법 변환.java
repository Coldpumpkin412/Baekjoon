import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int answer=0;
		
		st = new StringTokenizer(br.readLine());
		String str = st.nextToken();
		int number = Integer.parseInt(st.nextToken());
		
		for(int i=0 ; i<str.length() ; i++) {
			char ch = str.charAt(i);
			
			if('0'<=ch && ch<='9') {
				answer = answer*number + (ch-'0');
			}else {
				answer = answer*number + (ch-'A'+10);
			}
		}
		
		System.out.println(answer);
		
	}
}

	
