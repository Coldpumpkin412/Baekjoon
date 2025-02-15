import java.util.*;
import java.io.*;


public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
        
        st = new StringTokenizer(br.readLine());
		String s = st.nextToken().toLowerCase() + ' ';
		int n = Integer.parseInt(st.nextToken());
		
		boolean[] alpha = new boolean[26];
		
		char c = s.charAt(0);
        
		int count = 1;
		
		for(char ch : s.toCharArray()) {
			if(ch == c) {
				count++;
			}else {
				if(!alpha[c - 'a']) {
					sb.append(count >= n ? 1 : 0);
					alpha[c - 'a'] = true;
				}
				
				c = ch;
                
				count = 1;
			}
		}
		
		System.out.print(sb.toString());
	}
}