import java.util.*;

public class Main {
    static int[] num;
    private static int N; // 정수의 개수
    private static int S; // 정수의 합
    private static int answer = 0;
    
    
    //DFS함수
    public static void DFS(int depth, int sum) {
        if (depth == N) {
            if (sum == S) answer++;
            return;
        }
        //tree를 생각해서 직접 그려보면 이해하기가 쉽습니다.
        DFS(depth + 1, sum + num[depth]);
        DFS(depth + 1, sum); 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //N,S 입력 및 배열 선언
        N = sc.nextInt();
        S = sc.nextInt();
        num = new int[N];
        
        for (int i=0; i<N; i++) {
            num[i] = sc.nextInt();
        }
        
        //dfs 실행
        DFS(0, 0);
        
        //S 0일때가 전체 합이 0 일때랑 겹치기 때문에 -1
        if (S == 0) System.out.println(answer - 1); 
        else System.out.println(answer);

    }
    
   
}