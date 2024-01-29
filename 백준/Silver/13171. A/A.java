import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int MOD = 1000000007;
        
        //정수 A, X 입력
        Long A = Long.parseLong(br.readLine());
        Long X = Long.parseLong(br.readLine());
        
        Long answer = 1L;
        
        A %= MOD;

        while(X > 0) {
            if((X&1) == 1){
                answer = answer * A % MOD;
            }
            X >>= 1;
            A = A*A % MOD;
        }

        System.out.println(answer);
    }
}