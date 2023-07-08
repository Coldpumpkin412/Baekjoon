import java.util.*;
 
public class Main {
	//숫자 배열
	static int[] arr;		
    
    //다이나믹프로그래밍에 활용될 dp배열
	static Integer[] dp;    
    
    // 최댓값 변수
	static int max;	
    
    static int recur(int N) {
		
		//방문한 적 없는 인덱스인 경우
		if(dp[N] == null) {
            //이전 값에 현재 값을 더한것 vs 현재값 중 최댓값
			dp[N] = Math.max(recur(N - 1) + arr[N], arr[N]);
 
			//최댓값 갱신
			max = Math.max(dp[N], max);
		}
		
		return dp[N];
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		arr = new int[N];
		dp = new Integer[N];
		
        //배열 숫자들 입력
		for(int i=0 ; i<N ; i++) {
			arr[i] = sc.nextInt();
		}
		
		/*
         * 다이나믹프로그래밍 초기값 설정 및 최댓값 초기화
		 */
		dp[0] = arr[0];
		max = arr[0];
		
		//재귀함수 호출
		recur(N - 1);
		
		System.out.println(max);
	}
}