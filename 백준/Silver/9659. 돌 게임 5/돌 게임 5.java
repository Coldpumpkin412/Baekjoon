import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        //N입력
        long N = sc.nextLong();
        
        //홀수면 SK, 짝수면 CY 입력
        if(N%2==0){
            System.out.println("CY");
        }else{
            System.out.println("SK");
        }
    }
}