import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int K = sc.nextInt();

        int answer = 0;
        
        if(N+M > K) {
            answer = N/2<M ? N/2 : M;
            K -= (N+M) - answer * 3; // rest 제외
            
            if(K > 0) {
                answer -= (K+2) / 3;
            }
        }
        
        System.out.println(answer);
    }
}