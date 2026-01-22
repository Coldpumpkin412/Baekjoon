import java.util.*;
 
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while(T-->0){
            
            int N = sc.nextInt();
            
            int sum = 0;
            
            for(int i=0 ; i<N ; i++){
                sum += sc.nextInt();
            }
            
            if(sum == 0){
                System.out.println("Equilibrium");
            }else if(sum > 0){
                System.out.println("Right");
            }else{
                System.out.println("Left");
            }
            
        }
    }
}