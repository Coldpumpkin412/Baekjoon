import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        
        int N = sc.nextInt();
        int M = sc.nextInt();
        int K = sc.nextInt();
        
        int answer = Math.min(M, K) + Math.min(N-M, N-K);
        
        System.out.println(answer);
    }
}