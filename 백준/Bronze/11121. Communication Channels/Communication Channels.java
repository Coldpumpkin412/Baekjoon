import java.util.*;
 
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while(T-->0) {
            String first = sc.next();
            String second = sc.next();
            
            if(first.equals(second)) {
                System.out.println("OK");
            }else {
                System.out.println("ERROR");
            }
        }
 
    }
}