import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int A = sc.nextInt();
        int T = sc.nextInt();
        
        int P = 2*(25-A+T) + 10;
        
        if(P < 0) {
            P = 0;
        }
        
        System.out.println(P);
    }
}