import java.util.*;
 
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            int A = sc.nextInt();
            String str = sc.next();
            int B = sc.nextInt();
            
            if(A==0 && str.equals("W") && B==0) {
                break;
            }
            
            if(str.equals("D")) {
                System.out.println(A + B);
            }else {
                if(A-B < -200) {
                    System.out.println("Not allowed");
                }else {
                    System.out.println(A - B);
                }
            }
        }
 
    }
}