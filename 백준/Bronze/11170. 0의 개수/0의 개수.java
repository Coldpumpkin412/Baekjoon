import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st;
    	
    	//테스트케이스 T 입력
    	int T = Integer.parseInt(br.readLine());
    	while(T-->0) {
    		int count = 0;
    		
    		//숫자 두 개 입력
    		st = new StringTokenizer(br.readLine());
    		int N = Integer.parseInt(st.nextToken());
    		int M = Integer.parseInt(st.nextToken());
    		
    		for(int i=N ; i<=M ; i++) {
    			//숫자를 문자열로 변환 및 길이 선언
    			String number = Integer.toString(i);
    			int len = number.length();
    			
    			//0을 공백으로 치환 후 기준 길이에서 변환 후 길이 빼주기
    			number = number.replace("0", "");
    			
    			count += len-number.length();
    		}
    		
    		System.out.println(count);
    	}
    }
}	
