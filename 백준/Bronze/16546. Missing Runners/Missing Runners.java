import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
               
        int N = sc.nextInt();
        
        long total = (long) N*(N+1)/2;
        long cur = 0;
        
        for (int i=0 ; i<N-1 ; i++) {
            cur += sc.nextInt();
        }
        
        System.out.println(total - cur);
        
    }
}