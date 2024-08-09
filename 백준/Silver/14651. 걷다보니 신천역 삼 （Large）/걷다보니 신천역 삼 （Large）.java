import java.util.*;
import java.io.*;

public class Main {   
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        //N 입력
        int N = Integer.parseInt(br.readLine());
        
        int MOD = 1000000009;
        int answer = 2;
        
        //N이 1인경우
        if(N == 1) {
            System.out.println(0);
            return;
        }
        
        for(int i=2 ; i<N ; i++) {
            answer = (int)(1L * answer * 3 % MOD);
        }
        
        System.out.println(answer);
    }
}