import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if(sc.hasNextLong()) {
            long N = sc.nextLong();
            long M = sc.nextLong();
            
            System.out.println(N*M);
        }
        
    }
}