import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        
        //문제 수 T 입력
        int T = Integer.parseInt(br.readLine());
        
        int[] answer = new int[80001];
        answer[10] = 25;
        int tmp = 25;
        
        for(int i=11 ; i<=80000 ; i++) {
            if(i%3==0 || i%7==0) {
                answer[i] = tmp + i;
                tmp = answer[i];
            }else {
                answer[i] = tmp;
            }
        }
        
        //T개의 자연수 N 입력
        st = new StringTokenizer(br.readLine());
        for(int i=0 ; i<T ; i++) {
            int N = Integer.parseInt(st.nextToken());
            
            sb.append(answer[N] + "\n");
        }
        
        System.out.println(sb.toString());
    }
}