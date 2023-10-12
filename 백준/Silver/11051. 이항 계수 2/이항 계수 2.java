import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        //이항계수의 성질, 파스칼의 삼각형 활용하여 풀기
		Scanner sc = new Scanner(System.in);
		
        //N, K 입력
		int N = sc.nextInt();
		int K = sc.nextInt();
		
        //이항계수를 2차원배열로 표현
		int[][] arr = new int[N+1][N+1];
		
		for(int i=0 ; i<N+1 ; i++) {
			for(int j=0 ; j<=i ; j++) {
                //파스칼의 삼각형 성질을 활용하여 표현해주기
				if(i==j || j==0){
                    arr[i][j] = 1;
                } else {
                    //nCr = n-1Cr-1 + n-1Cr
                    arr[i][j] = (arr[i-1][j-1]+arr[i-1][j]) % 10007;
                }
					
			}
		}
		System.out.println(arr[N][K]);
	}
}