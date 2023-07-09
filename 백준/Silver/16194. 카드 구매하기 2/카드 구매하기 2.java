import java.util.*;

public class Main {

    public static void main(String[] args) {
        //카드구매하기 1번 문제와 같은 유형.
        //다이나믹 프로그래밍 활용
        
        Scanner sc = new Scanner(System.in);
        
        //N입력 및 카드팩 배열, 다이나믹프로그래밍 배열 선언
        int N = sc.nextInt();
        int[] card = new int[1001]; 
        int[] dp = new int[10001]; 
        
        for(int i=1 ; i<=N ; i++){
            card[i] = sc.nextInt();
        }

        for(int i=1 ; i<=N ; i++){
            //최소값 초기화
            dp[i] = card[i]; 
            
            //점화식 활용하여 다이나믹프로그램이 값 정하기
            for(int j=1 ; j<=i ; j++){
                dp[i] = Math.min(dp[i], dp[i-j]+card[j]);
            }
        }

        System.out.println(dp[N]);
        
    }
}