import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int K = sc.nextInt(); 
        int X = sc.nextInt();

        int answer = 0;
        
        for(int i=K-X ; i<K+X+1 ; i++) {
            if(B < i || i < A) {
                continue;
            }
            
            answer++;
        }

        if(answer == 0) {
            System.out.print("IMPOSSIBLE");
        }else {
            System.out.print(answer);
        }
    }
}