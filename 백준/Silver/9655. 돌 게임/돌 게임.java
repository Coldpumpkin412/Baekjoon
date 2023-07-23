import java.util.*;

public class Main{
    public static void main(String[] args){
        /*
         * N이 홀수면 상근의 승리, 짝수면 창영의 승리
         */
        Scanner sc = new Scanner(System.in);
        
        int N =sc.nextInt();
        
        if(N%2==1){
            System.out.println("SK");
        }else{
            System.out.println("CY");
        }
    }
}