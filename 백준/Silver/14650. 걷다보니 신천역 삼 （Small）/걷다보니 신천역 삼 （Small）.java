import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
        //다이나믹프로그래밍 활용
		Scanner sc = new Scanner(System.in);
        
        //N입력 및 다이나믹프로그래밍에 활용할 배열 선언
		int N = sc.nextInt();
		int[] dp = new int[10];
        
        //초기값 설정
		dp[2] = 2;
        
		for (int i=3 ; i<dp.length ; i++) {
			dp[i] = dp[i-1]*3;
		}
        
		System.out.println(dp[N]);
	}
}