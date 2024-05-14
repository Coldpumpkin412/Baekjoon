import java.util.*;
import java.io.*;

public class Main {
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st;
    	
    	//조카의 수 M, 과자의 수 N 입력
    	st = new StringTokenizer(br.readLine());
    	int M = Integer.parseInt(st.nextToken());
    	int N = Integer.parseInt(st.nextToken());
    	
    	//막대과자 길이 저장 배열 선언 및 길이 입력
    	int[] snack = new int[N];
    	
    	st = new StringTokenizer(br.readLine());
    	for(int i=0 ; i<N ; i++) {
    		snack[i] = Integer.parseInt(st.nextToken());
    	}
    	
    	//막대과자 길이 오름차순 정렬
    	Arrays.sort(snack);
    	
    	long answer = 0;
    	
    	//이분탐색에 활용할 변수 선언
    	long left = 1;
    	long right = snack[N-1];
    	
    	//이분탐색
    	while(left <= right) {
    		//막대과자를 받는 조카의 수
    		int count = 0;
    		
    		//중간값(현재 막대과자의 길이)
    		long mid = (left+right) / 2;
    		
    		//과자 받는 조카의 수 계산
    		for(int i=0 ; i<N ; i++) {
    			count += snack[i]/mid;
    		}
    		
    		//과자를 받는 조카의 수가 M보다 큰 경우
    		if(count >= M) {
    			//최댓값으로 갱신
    			answer = Math.max(answer, mid);
    			
    			//left변수 이동
    			left = mid + 1;
    		}else {
    			right = mid - 1;
    		}
    	}
    	
    	System.out.println(answer);
    }
}	
