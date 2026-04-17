import java.util.*;
 
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        
        boolean check = false;
        
        while(N-->0){
            String name = sc.next();
            
            if (name.equals("anj")) {
                check = true;
            }
        }
        
        System.out.println(check ? "뭐야;" : "뭐야?");
    }
}