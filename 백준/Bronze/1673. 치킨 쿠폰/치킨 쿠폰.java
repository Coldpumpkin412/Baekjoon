import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        while(sc.hasNextInt()){
            //N, K 입력
            int N = sc.nextInt();
            int K = sc.nextInt();
            
            int tmp = N;
            int coupon = 0;
            while(tmp >= K){
                coupon += tmp/K;
                
                tmp = tmp/K + tmp%K;
            }
            
            System.out.println(N + coupon);    
        }
        
    }
}