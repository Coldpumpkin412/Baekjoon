import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        //총 가격
        int sum = sc.nextInt();
        
        for(int i=0 ; i<9 ; i++){
            sum -= sc.nextInt();
        }
        
        System.out.println(sum);
    }
}