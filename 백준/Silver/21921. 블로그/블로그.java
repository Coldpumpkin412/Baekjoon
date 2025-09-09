import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        //지난일수 N, X 입력
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());
        
        int[] visit = new int[N];
        
        st = new StringTokenizer(br.readLine());
        for(int i=0 ; i<N ; i++) {
            visit[i] = Integer.parseInt(st.nextToken());
        }

        int sum = 0;
        for(int i=0 ; i<X ; i++) {
            sum += visit[i];
        }

        int max = sum;
        int answer = 1;
        
        //슬라이딩 윈도우 기법(한 칸씩 이동)
        for(int i=0 ; i<N-X ; i++) {
            sum += visit[i+X];
            sum -= visit[i];

            if(sum == max) { 
                answer++;
            }

            if(sum > max) {
                answer = 1;
                max = sum;
            }
        }
        
        if(max == 0){
            System.out.println("SAD");
        }else {
            System.out.println(max);
            System.out.println(answer);
        }
    }
}