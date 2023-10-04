import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
	
    public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st;
    	
    	//수열의 길이 N입력 및 배열 선언
    	int N = Integer.parseInt(br.readLine());
    	int[] arr = new int[N];
    	
    	//배열 값 입력
    	st = new StringTokenizer(br.readLine());
    	for(int i=0 ; i<N ; i++) {
    		arr[i] = Integer.parseInt(st.nextToken());
    	}
    	
        //배열 크기 1이면 1출력 후 종료!
    	if(N==1) {
    		System.out.println("1");
    		return;
    	}

    	int answer = 0;
    	
    	//가장 긴 구간 값 초기화
    	int max = 1;
    	
    	//정방향으로 가는경우
    	for(int i=0 ; i<N-1 ; i++) {
    		//이전값보다 현재값이 더 크거나 같은경우
    		if(arr[i] <= arr[i+1]) {
    			max++;
    		}else {//최댓값 설정 및 max 초기화
    			max = 1;
    		}
    		
    		answer = Math.max(answer, max);
    	}
    	
    	//역방향으로 가는경우
    	int max2 = 1;
    	for(int i=0 ; i<N-1 ; i++) {
    		//이전값이 현재값보다 더 크거나 같은경우
    		if(arr[i] >= arr[i+1]) {
    			max2++;
    		}else {//최댓값 설정 및 max 초기화
    			max2 = 1;
    		}

			answer = Math.max(answer, max2);
    	}
    	
    	
    	System.out.println(answer);
    }
}	
