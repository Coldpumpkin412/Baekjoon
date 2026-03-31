import java.util.*;
import java.io.*;

public class Main {	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st;
    	
    	//테스트케이스 개수 T 입력
    	int T = Integer.parseInt(br.readLine());
    	
    	//케이스 번호 변수
		int index = 1;
    	
    	while(T-->0) {
    		
    		//봉우리 개수 변수
    		int count = 0;
    		
    		//체크포인트 개수 N 입력
        	int N = Integer.parseInt(br.readLine());
        	
        	//체크포인트별 높이 저장 배열 선언
        	int[] height = new int[N];
        	
        	//체크포인트별 높이 입력
        	st = new StringTokenizer(br.readLine());
        	for(int i=0 ; i<N ; i++) {
        		height[i] = Integer.parseInt(st.nextToken());
        	}
        	
        	//첫번째 체크포인트와 마지막 체크포인트를 제외한 체크포인트들이 봉우리인지 확인
        	for(int i=1 ; i<N-1 ; i++) {
        		if(height[i-1]<height[i] && height[i]>height[i+1]) {
        			count++;
        		}
        	}
        	
        	//출력 (출력 후 다음케이스에는 케이스번호 증가)
        	System.out.println("Case #"+ index++ +": "+count);
        	
    	}
    	
    }
}
