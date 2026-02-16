import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        long X = sc.nextLong();
        long D = sc.nextLong();
        
        if(D >= 2*X) {
            System.out.println("double it");
        }else {
            System.out.println("take it");
        }
        
    }
}