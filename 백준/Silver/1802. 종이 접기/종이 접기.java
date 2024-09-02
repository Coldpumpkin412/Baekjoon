import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		
		//테스트케이스 개수 T 입력
		int T = Integer.parseInt(br.readLine().trim());
	
		while(T-->0) { 
			//입력값 문자열배열로 변환
			char[] ch = br.readLine().toCharArray();
			
			boolean check = true; 
			
			int start = 0;
			int end = ch.length - 1; 
			
			while(end > start) {
				int mid = (end-start) >> 1;
				
				for(int i=start, j=end ; i<mid ; i++, j--) {
					if(ch[i] == ch[j]) {
						check = false;
                        
						end = start;
                        
						break;
					}					
				}
				if(check) {
					end = mid - 1;
				}
			}
			
			if(check) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		}
	}

}