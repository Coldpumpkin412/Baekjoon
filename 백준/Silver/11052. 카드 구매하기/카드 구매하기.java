import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //n 입력
        int n = sc.nextInt();
        
        //카드 배열 및 다이나믹프로그래밍 배열 선언
        int[] card = new int[n+1];
        int[] dp = new int[n+1];
        
        //카드팩 입력
        for(int i=1 ; i<=n ; i++){
            card[i] = sc.nextInt();
        }
        
        //최대 비용을 구하는것이기 때문에 이전 값 + 카드팩 가격과 비교 후 정하기(점화식)
        for(int i=1 ; i<=n ; i++) {
            for (int j=1 ; j<=i ; j++) {
                dp[i] = Math.max(dp[i], dp[i-j] + card[j]);
            }
        }

        System.out.println(dp[n]);
    }
}