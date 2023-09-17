import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st;
    	StringBuilder sb = new StringBuilder();
    	
    	//테스트케이스 개수 T 입력
    	int T = Integer.parseInt(br.readLine());
    	
    	while(T-->0) {
    		int answer = 0;
    		long num = Long.parseLong(br.readLine());
    		
    		for(int i=5 ; i<=num ; i*=5) {
    			answer += num/i;
    		}
    		
    		sb.append(answer).append("\n");
    	}
    	
    	System.out.println(sb);
    }
}	
