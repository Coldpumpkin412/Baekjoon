import java.util.*;
import java.io.*;

public class Main {
    
    public static void main(String[] args) throws IOException{
		/*
		 * 다이나믹프로그래밍 활용
		 */
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st;
    	
    	//정답배열
    	int[] answer = new int[2];
    	answer[0] = 0;
    	answer[1] = Integer.MAX_VALUE;
    	
    	//배열의 크기 N입력 및 배열 선언
    	int N = Integer.parseInt(br.readLine());
    	//한 줄에 3개씩이므로 열은 3줄까지만
    	int[][] arr = new int[N+1][3];
    	
    	//배열 값 입력
    	for(int i=0 ; i<N ; i++) {
    		st = new StringTokenizer(br.readLine());
    		
    		for(int j=0 ; j<3 ; j++) {
    			arr[i][j] = Integer.parseInt(st.nextToken());
    		}
    	}
    	
    	//다이나믹프로그래밍에 활용할 배열 두 개(최소, 최대)선언
    	int[][] minDP = new int[N+1][3];
    	int[][] maxDP = new int[N+1][3];
    	
    	//점화식활용하여 다이나믹프로그래밍 배열 갱신
    	for(int i=1 ; i<=N ; i++) {
    		//최댓값(왼쪽, 중앙, 오른쪽)
    		maxDP[i][0] = Math.max(maxDP[i-1][0], maxDP[i-1][1]) + arr[i-1][0];
    		maxDP[i][1] = Math.max(Math.max(maxDP[i-1][0], maxDP[i-1][1]), maxDP[i-1][2]) + arr[i-1][1];
    		maxDP[i][2] = Math.max(maxDP[i-1][1], maxDP[i-1][2]) + arr[i-1][2];
    		
    		//최솟값(왼쪽, 중앙, 오른쪽)
    		minDP[i][0] = Math.min(minDP[i-1][0], minDP[i-1][1]) + arr[i-1][0];
    		minDP[i][1] = Math.min(Math.min(minDP[i-1][0], minDP[i-1][1]), minDP[i-1][2]) + arr[i-1][1];
    		minDP[i][2] = Math.min(minDP[i-1][1], minDP[i-1][2]) + arr[i-1][2];
    	}
    	
    	//최댓값, 최솟값 저장
    	for(int i=0 ; i<3 ; i++) {
    		answer[0] = Math.max(answer[0], maxDP[N][i]);
    		answer[1] = Math.min(answer[1], minDP[N][i]);
    	}
    	
    	//정답 출력
    	System.out.println(answer[0]+" "+answer[1]);
    }
}	
