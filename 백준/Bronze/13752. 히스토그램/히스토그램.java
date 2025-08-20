import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //테스트케이스 개수 N 입력
        int N = sc.nextInt();
        
        while(N-->0) {
            //히스토그램 크기 K 입력
            int K = sc.nextInt();
            
            String bar = "=";
            
            String answer = bar.repeat(K);
            
            System.out.println(answer);
        }
    }
}