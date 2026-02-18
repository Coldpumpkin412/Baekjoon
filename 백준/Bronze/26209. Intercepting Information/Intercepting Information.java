import java.util.*;
 
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        boolean check = true;
        
        for (int i=0 ; i<8 ; i++) {
            int N = sc.nextInt();
            
            if(N == 9) {
                check = false;
            }
        }
        
        if(check == true) {
            System.out.print("S");
        }else if(check == false) {
            System.out.print("F");
        }
 
    }
}