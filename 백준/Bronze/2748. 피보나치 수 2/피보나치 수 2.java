import java.util.Scanner;
 
public class Main {
	static long[] dp; 
    
    public static long Fib(int N) {
		if(dp[N] == -1) {
			dp[N] = Fib(N - 1) + Fib(N - 2);
		}
		return dp[N];
	}
    
	public static void main(String[] args) {
        //동적프로그래밍 활용
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		
		dp = new long[N + 1];
 
		for(int i = 0; i < N + 1; i++) {
			dp[i] = -1;
		}
        
		dp[0] = 0;
		dp[1] = 1;
		System.out.println(Fib(N));
	} 
}