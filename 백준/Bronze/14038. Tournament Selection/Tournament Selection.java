import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int count = 0;
        
        for(int i=0 ; i<6 ; i++) {
            String str = sc.nextLine();
            
            if(str.equals("W")) {
                count = count +1;
            }
        }
        
        if(count > 4) {
            System.out.println(1);
        }else if(count > 2) {
            System.out.println(2);
        }else if(count > 0) {
            System.out.println(3);
        }else {
            System.out.println(-1);
        }

    }
}