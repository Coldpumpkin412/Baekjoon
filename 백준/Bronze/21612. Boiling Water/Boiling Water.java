import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int B = sc.nextInt();
        
        int result = 5*B - 400;
        
        System.out.println(result);
        
        if(result == 100) {
            System.out.print("0");
        }else if(result < 100) {
            System.out.print("1");
        }else if(result > 100) {
            System.out.print("-1");
        }
 
    }
}