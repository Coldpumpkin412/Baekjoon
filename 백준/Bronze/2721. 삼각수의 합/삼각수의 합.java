import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while(T-->0) {
            int N = sc.nextInt();
            
            int total = 0;
            
            for(int i=1 ; i<=N ; i++) {
                total += i * (i + 1) * (i + 2) / 2;
            }
            System.out.println(total);
        }
    }
}