import java.util.*;
import java.math.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        
        int N = sc.nextInt();
        
        int max= 0;
        
        while(N-->0){
            
            int score = 0;
            
            for(int i=0 ; i<3 ; i++) {
                score += A * sc.nextInt();
                score += B * sc.nextInt();
                score += C * sc.nextInt();
            }
 
            max = Math.max(max, score);
        }
        
        System.out.print(max);
    }
}