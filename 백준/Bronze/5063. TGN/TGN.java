import java.util.*;

public class Main {
    public static void main(String args[]) {        
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        
        while(N-->0){
            int r = sc.nextInt();
            int e = sc.nextInt();
            int c = sc.nextInt();
            
            int sum = e-c;
            
            if(r > sum) {
                System.out.println("do not advertise");
            }else if(r < sum) {
                System.out.println("advertise");
            }else {
                System.out.println("does not matter");
            }
        }
    }
}