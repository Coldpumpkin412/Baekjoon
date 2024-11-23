import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();		
        
        //테스트케이스 개수 T 입력
		int T = Integer.parseInt(br.readLine());
		while(T-->0) {            
            //메시지, 변환 규칙 입력
			String code = br.readLine();
			String crypto = br.readLine();
            
			for(int i=0 ; i<code.length() ; i++) {
				if(code.charAt(i)>='A' && code.charAt(i)<='Z') {
					sb.append(crypto.charAt(code.charAt(i)-'A'));
				}else {
					sb.append(code.charAt(i));
				}
			}
			sb.append("\n");
		}
		System.out.println(sb.toString());
	}
}