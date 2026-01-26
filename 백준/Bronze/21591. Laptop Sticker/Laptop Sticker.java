import java.util.*;
 
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int Wc = sc.nextInt();
        int Hc = sc.nextInt();
        int Ws = sc.nextInt();
        int Hs = sc.nextInt();
        
        if(Ws<=Wc-2 && Hs<=Hc-2){
            System.out.print(1);
        }else {
            System.out.print(0);
        }
        
    }
}