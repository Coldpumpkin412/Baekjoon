import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st;
    	StringBuilder sb = new StringBuilder();
    	
    	//수열의 길이 N 입력
    	int N = Integer.parseInt(br.readLine());
    	
    	//배열 A 선언 및 값 입력
    	int[] A = new int[N+1];
    	
    	st = new StringTokenizer(br.readLine());
    	for(int i=1 ; i<=N ; i++) {
    		A[i] = Integer.parseInt(st.nextToken());
    	}
    	
    	//인덱스 및 정답배열 선언
    	int index = -1;
    	int[] answer = new int[N+1];
    	
    	//배열의 맨 마지막 원소부터 진행
    	for(int i=N ; i>=2 ; i--) {
    		//인덱스 값이 정답배열의 값이다.
    		answer[i] = index;
    		
    		//현재 배열값이 앞의 배열값과 다르다면
    		if(A[i] != A[i-1]) {
    			//인덱스를 변경
    			index = i;
    		}
    	}
    	
    	//첫번째 원소는 현재 인덱스의 값을 따른다
    	answer[1] = index;
    	
    	//출력
    	for(int i=1 ; i<=N ; i++) {
    		sb.append(answer[i]+" ");
    	}
    	
    	System.out.print(sb.toString());
    }
}	
