import java.util.*;
 
public class Main {
    public static void main(String args[]) {        
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        
        while(N-->0) {
            int X = sc.nextInt();
            if(X%2 == 0) {
                System.out.println(X + " is even");
            }else {
                System.out.println(X + " is odd");
            }
        }
 
    }
}