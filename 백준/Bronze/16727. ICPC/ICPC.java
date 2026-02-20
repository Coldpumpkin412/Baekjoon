import java.util.*;
 
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int P1 = sc.nextInt();
        int S1 = sc.nextInt();
        int S2 = sc.nextInt();
        int P2 = sc.nextInt();
        
        if(P1+P2 > S1+S2) {
            System.out.print("Persepolis");
        }else if(P1+P2 < S1+S2) {
            System.out.print("Esteghlal");
        }else if(P1+P2 == S1+S2) {
            
            if(P2 > S1) {
                System.out.print("Persepolis");
            }else if(P2 < S1) {
                System.out.print("Esteghlal");
            }else {
                System.out.print("Penalty");
            }
            
        }
        
    }
}