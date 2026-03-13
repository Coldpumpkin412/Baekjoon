import java.util.*;
 
public class Main {
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while(T-->0) {
            int num = sc.nextInt();
            String repeatCharacter = sc.next();
            
            System.out.println(repeatCharacter.repeat(num));
        }
 
    }
}