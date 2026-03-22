import java.util.*;
 
public class Main {
    public static void main(String args[]) {    
        Scanner sc = new Scanner(System.in);
        
        int K = sc.nextInt();
        
        double answer = (K * 0.01 + 25);
        
        if(answer < 100) {
            System.out.print(100);
        }else if (answer > 2000) {
            System.out.print(2000);
        }else {
            System.out.print(answer);    
        }
        
    }
}