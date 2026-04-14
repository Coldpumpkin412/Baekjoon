import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while(T-->0){
            int N = sc.nextInt();
            
            int answer = 1;
            
            for(int i=1 ; i<=N ; i++){
                answer *= i;
            }
            
            System.out.println(answer%10);
        }
    }
}