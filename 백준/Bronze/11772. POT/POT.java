import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        
        int sum = 0;
        
        for(int i=0 ; i<N ; i++) {
            int index = sc.nextInt();
            int sub = index / 10;
            int sup = index % 10;
            
            sum += (int)Math.pow(sub, sup);
        }
        
        System.out.println(sum);
    }
}