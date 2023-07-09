import java.util.*;

public class Main {
	public static void main(String[] args) {
        //0~9까지의 각 숫자에서 만들 수 있는 오르막수 : 이전 자리수 N-1에서의 j부터 마지막 9까지의 합.
		//이를 활용하여 다이나믹프로그래밍 사용
        Scanner sc = new Scanner(System.in);
        
        //N 및 다이나믹 프로그래밍에 활용될 배열 선언
		int N = sc.nextInt();
		int[][] dp = new int[N+1][10];
		
        //초기값 설정
		for(int i=0 ; i<10 ; i++) {
			dp[0][i] = 1;
		}
        
	    //점화식 적용 후 모듈러연산
		for(int i=1 ; i<N+1 ; i++) {
			for(int j=0 ; j<10 ; j++) {
				for(int k=j ; k<10 ; k++) {
					dp[i][j] += dp[i-1][k];
					dp[i][j] %= 10007;
				}
			}
		}
		
		System.out.println(dp[N][0]%10007); 
	}

}