import java.util.*;
 
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int Ca = sc.nextInt();
        int Ba = sc.nextInt();
        int Pa = sc.nextInt();
        
        int Cr = sc.nextInt();
        int Br = sc.nextInt();
        int Pr = sc.nextInt();
 
        int answer = 0;
        
        if(Cr-Ca > 0) {
            answer += Cr-Ca;
        }
        if(Br-Ba > 0) {
            answer += Br-Ba;
        }
        if(Pr-Pa > 0) {
            answer += Pr-Pa;
        }
        
        System.out.print(answer);
        
    }
}