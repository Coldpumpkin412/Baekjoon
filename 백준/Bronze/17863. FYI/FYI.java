import java.util.*;
 
public class Main {
    public static void main(String[] args) {    
        Scanner sc = new Scanner(System.in);
        
        String str = sc.next();
        String sub = str.substring(0, 3);        
        
        if(sub.equals("555")) {
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
 
    }
}