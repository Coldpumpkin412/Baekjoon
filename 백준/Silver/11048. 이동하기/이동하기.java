import java.util.*;
import java.io.*;

public class Main {
	
    public static void main(String[] args) throws IOException{
    	/*
    	 * 현재를 기준으로 왼쪽, 위, 대각선왼쪽 위 중 최댓값을 현재위치의 값과 더해주며
    	 * 최댓값을 찾아가기
    	 */
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st;
    	
    	int answer = -1;
    	
    	//N,M 입력
    	st = new StringTokenizer(br.readLine());
    	int N = Integer.parseInt(st.nextToken());
    	int M = Integer.parseInt(st.nextToken());
    	
    	//배열 선언 및 값 입력
    	int[][] arr = new int[N+1][M+1];
    	
    	for(int i=1; i<=N ; i++) {
    		st = new StringTokenizer(br.readLine());
    		
    		for(int j=1 ; j<=M ; j++) {
    			arr[i][j] = Integer.parseInt(st.nextToken());
    		}
    	}
    	
    	//배열값 비교해가며 최댓값을 더해주기
    	for(int i=1; i<=N ; i++) {
    		for(int j=1 ; j<=M ; j++) {
    			answer = Math.max(arr[i][j-1], Math.max(arr[i-1][j-1], arr[i-1][j]));
    			arr[i][j] += answer;
    		}
    	}
    	
    	System.out.println(arr[N][M]);
    }
}	
