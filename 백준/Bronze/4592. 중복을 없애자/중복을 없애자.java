import java.util.*;
 
public class Main {
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        
        while(true) {
            int N = sc.nextInt();
            
            if(N == 0) {
                break;
            }
            
            int num = sc.nextInt();
            
            System.out.print(num + " ");
            
            for(int i=0 ; i<N-1 ; i++) {
                int nextNum = sc.nextInt();
                
                if (num != nextNum) {
                    System.out.print(nextNum + " ");
                    num = nextNum;
                }
            }
            
            System.out.println("$");
        }
 
    }
}