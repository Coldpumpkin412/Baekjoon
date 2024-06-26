import java.util.*;
import java.io.*;

public class Main {
	static int ASCII = 65;	
    
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
        
		int T = Integer.valueOf(br.readLine());
		
		while(T-->0) {
			st = new StringTokenizer(br.readLine());
			String msg = st.nextToken();
			char[] msgCharArr = msg.toCharArray();
			int[] alphabet = new int[26];
			boolean isValid = true;
			
			// 알파벳 개수 카운트
			for(int i=0 ; i<msgCharArr.length ; i++) {
				int gap = msgCharArr[i] - ASCII;
                
				alphabet[gap]++;
                
				if(alphabet[gap] == 3) {
					if(i+1 >= msgCharArr.length) {
						isValid = false;
						break;
					}
					
					if(msgCharArr[i] == msgCharArr[i + 1]) {
						alphabet[gap] = 0;
						i++;
					}else {
						isValid = false;
						break;
					}
				}
			}
			
			if(isValid) {
				sb.append("OK").append("\n");
			}
			else {
				sb.append("FAKE").append("\n");
			}
		}
		
		System.out.println(sb.toString());
	}
}