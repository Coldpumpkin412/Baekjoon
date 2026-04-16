import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int min = Integer.MAX_VALUE;

        for (int i=0 ; i<3 ; i++) {
            int count = sc.nextInt();
            
            count /= i == 1 ? 2 : 1;
            
            min = Math.min(min, count);
        }

        System.out.println(min);
    }
}