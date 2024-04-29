import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        //조약돌 색상의 개수 M 입력
        int M = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        
        int N = 0;
        
        //각 색상의 조약돌 개수 입력
        int[] color = new int[M];
        for(int i=0 ; i<M ; i++) {
            color[i] = Integer.parseInt(st.nextToken());
            
            N += color[i];
        }
        
        //뽑을 조약돌의 수 K 입력
        int K = Integer.parseInt(br.readLine());
        
        double answer = 0;
        for(int i=0 ; i<M ; i++) {
            double value = 1;
            
            for(int j=0 ; j<K ; j++){
                value *= ((double) (color[i]-j)/(N-j));
            }
            
            answer += value;
        }
        
        System.out.println(answer);
    }
}