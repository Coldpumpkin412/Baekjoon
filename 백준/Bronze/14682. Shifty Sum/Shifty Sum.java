import java.util.*;
 
public class Main {
    public static void main(String args[]) {        
        Scanner sc = new Scanner(System.in);
        
        String N = sc.next();
        
        int K = sc.nextInt();
        
        int sum = Integer.parseInt(N);
        
        for (int i=1 ; i<=K ; i++) {
            sum += Integer.parseInt(N + "0".repeat(i));
        }
        
        System.out.print(sum); 
    }
}