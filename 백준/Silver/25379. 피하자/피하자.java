import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        //N 입력
        int N = Integer.parseInt(br.readLine());
        
        long cntL = 0;
        long cntR = 0;
        long sum = 0;
        int index = 0;
        
        st = new StringTokenizer(br.readLine());
        for(int i=0 ; i<N ; i++) {
            //배열 원소 입력
            int num = Integer.parseInt(st.nextToken());
            
            //짝수인경우
            if(num%2 == 0) {
                sum += index++;
                
                cntL += i;
                cntR += N-1-i;
            }
        }
        
        System.out.println(Math.min(cntL, cntR) - sum);
    }
}