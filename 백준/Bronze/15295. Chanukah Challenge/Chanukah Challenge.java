import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int P = sc.nextInt();
        
        for(int i=0 ; i<P ; i++) {
            int K = sc.nextInt(); 
            int N = sc.nextInt();
            
            int answer = N*(N+3) / 2;
            
            System.out.println(K + " " + answer);
        }
        
    }
}