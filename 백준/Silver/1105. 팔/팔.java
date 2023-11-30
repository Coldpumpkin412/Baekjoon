import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st;
    	
    	//L, R 입력
    	st = new StringTokenizer(br.readLine());
    	String L = st.nextToken();
    	String R = st.nextToken();
    	

		int answer = 0;
    	
    	//L과 R의 자릿수가 다른경우 8이 없는경우가 존재
    	if(L.length() != R.length()) {
    		System.out.println(0);
    		return;
    	}else {//자릿수가 같은경우
    		
    		//맨 앞자리 수 부터 비교, 8의 개수 세주기
    		int index = 0;
    		while(index<L.length() && L.charAt(index)==R.charAt(index)) {
    			if(L.charAt(index) == '8') {
    				answer++;
    			}
    			
    			index++;
    		}
    	}
    	
    	System.out.println(answer);
    }
}	
