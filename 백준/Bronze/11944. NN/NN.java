import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        
        //N, M 입력
        int N = sc.nextInt();
        int M = sc.nextInt();
        

        for(int i=0 ; i<N ; i++) { 
            sb.append(N);
        }
        
        if(sb.length() > M) {
            System.out.println(sb.substring(0, M));
        }else {
            System.out.println(sb.toString());
        }
    }
}