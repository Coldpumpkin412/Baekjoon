import java.util.*;
import java.io.*;

public class Main {
    private static final int LIMIT = 10000;
    
    public static void main(String[] args) throws IOException {
        //누적합 활용하여 풀기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        //숫자의 개수 N 입력
        int N = Integer.parseInt(br.readLine());
       
        int[] sum = new int[LIMIT+1];
        int[] count = new int[LIMIT+1];
        
        st = new StringTokenizer(br.readLine());
        for(int i=1 ; i<=N ; i++) {
            int cur = Integer.parseInt(st.nextToken());
            sum[cur] += cur;
            count[cur]++;
        }
        
        for(int i=1 ; i<=LIMIT ; i++) {
            sum[i] += sum[i-1];
            count[i] += count[i-1];
        }
        
        int min = Integer.MAX_VALUE;
        
        int answer = 0;
        
        for(int i=1 ; i<=LIMIT ; i++) {
            if(count[i]-count[i-1] == 0){
              continue;  
            } 
            int calc = (i*count[i-1]-sum[i-1]) + (sum[LIMIT] - sum[i] - i*(count[LIMIT]-count[i]));
            if(min > calc) {
                min = calc;
                answer = i;
            }
        }
        System.out.println(answer);
    }
}