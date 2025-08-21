import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int sum = 0;
        
        for(int i=0 ; i<4 ; i++) {
            int move = sc.nextInt();
            
            sum += move;
        }
        int minute = sum / 60;
        int second = sum % 60;
        
        System.out.println(minute);
        System.out.println(second);
    }
}