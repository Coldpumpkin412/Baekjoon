import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        //참가선수의 수 N, 이변의 수 M, 탄산내성 K 입력
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int index = 0;        
        while(1 < N) {
            N /= 2;
            index++;
        }

        int a = 1;
        int count = 0;
        
        while(a < K) {
            a *= 2;
            count++;
        }
        
        if(a != K){
            count--;  
        } 

        int answer = count + M;
        
        //더 작은 값 출력
        System.out.print(index<answer ? index : answer);
    }
}