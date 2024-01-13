import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        
        int sqrtN = (int) Math.sqrt(N);
        
        //N이 짝수인 경우
        if(N%2 == 0) {
            System.out.println(N/2);
            return;
        }
        
        for(int i=3 ; i<=sqrtN ; i+=2) {
            if(N%i == 0) {
                System.out.println(N - N/i);
                return;
            }
        }
        
        System.out.println(N-1);
    }
}
