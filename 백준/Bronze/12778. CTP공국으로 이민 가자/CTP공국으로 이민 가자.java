import java.util.*;
 
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while(T-->0) {
            int M = sc.nextInt();
            String thisType = sc.next();
            
            for(int i=0 ; i<M ; i++) {
                if(thisType.equals("C")) {
                    char ch = sc.next().charAt(0);
                    
                    System.out.print(ch-'@'+" ");
                }else if(thisType.equals("N")) {
                    int N = sc.nextInt();
                    System.out.print((char)(N + 64)+" ");
                }
            }
            System.out.println();
        }
 
    }
}