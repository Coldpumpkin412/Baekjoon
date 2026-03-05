import java.util.*;
 
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while(T-->0) {
            String[] step = sc.next().split("");
            
            int count = 0;
            
            for(int i=0 ; i<step.length ; i++) {
                if (step[i].equals("D")) {
                    break;
                }else {
                    count++;
                }
            }
            
            System.out.println(count);
        }
 
    }
}