import java.util.*;
 
public class Main {
 
    public static void main(String[] args) {        
        Scanner sc = new Scanner(System.in);
        
        int count =0;
        while(sc.hasNextInt()) {
            int a = sc.nextInt();
            
            if(a > 0){
                count++;
            }
        }
        
        System.out.print(count);        
    }
}
