import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // N입력
        int N = sc.nextInt();
        
        if(0<=N && N<=10) {
            System.out.println(1);
        }else {
            int count = 2;
            
            for(int i=11 ; true ; i=10*i+1) {
                if(i<=N && N<=10*i) {
                    System.out.println(count);
                    
                    break;
                }
                
                count++;
            }
        }
    }
}
