import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
    	//역방향으로 탐색하기
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st;
    	StringBuilder sb = new StringBuilder();
    	
    	//테스트 케이스 개수 T 입력
    	int T = Integer.parseInt(br.readLine());
    	
    	while(T-->0) {
            //자료형 주의(문제 조건 참고)
    		long answer = 0;            
    		
    		//날의 수 N 입력
    		int N = Integer.parseInt(br.readLine());
    		
    		//시세 배열 선언
    		int[] price = new int[N];
    		
    		//시세 입력
    		st = new StringTokenizer(br.readLine());
    		for(int i=0 ; i<N ; i++) {
    			price[i] = Integer.parseInt(st.nextToken());
    		}
    		
    		//마지막 날 시세를 최댓값으로 설정
    		int max = price[N-1];
    		
    		//마지막 날 전 날부터 비교
    		for(int i=N-2 ; i>=0 ; i--) {
    			//시세 최댓값보다 작은경우
    			if(price[i] < max) {
    				//판매하여 이익 누적
    				answer += max-price[i];
    			}else {//시세 최댓값보다 큰경우
    				
    				//시세 최댓값 바꿔주기
    				max = price[i];
    			}
    		}
    		
    		sb.append(answer).append("\n");
    	}
    	
    	//결과값 출력
    	System.out.println(sb.toString());
    }
}	
