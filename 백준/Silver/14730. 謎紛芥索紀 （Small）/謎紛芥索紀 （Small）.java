import java.util.*;
import java.io.*;

public class Main {
	
    public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st;
    	
    	//항의 개수 N 입력
    	int N = Integer.parseInt(br.readLine());
    	
    	int answer = 0;
    	
    	while(N-->0) {
    		st = new StringTokenizer(br.readLine());
    		
    		//계수 C, 차수 K 입력
    		int C = Integer.parseInt(st.nextToken());
    		int K = Integer.parseInt(st.nextToken());
    		
    		//차수가 0이 아닌경우
    		if(K != 0) {
    			answer += C*K;
    		}else {
    			continue;
    		}
    	}
    	
    	System.out.println(answer);
    	
    }
}	
