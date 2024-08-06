import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        //격자크기 N, 점 개수 M 입력
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        //x, y 좌표 배열 선언
        int[] X = new int[M];
        int[] Y = new int[M];
        
        //좌표 입력
        for(int i=0 ; i<M ; i++) {
            st = new StringTokenizer(br.readLine());
            X[i] = Integer.parseInt(st.nextToken());
            Y[i] = Integer.parseInt(st.nextToken());
        }
        
        //좌표 각각 오름차순 정렬
        Arrays.sort(X);
        Arrays.sort(Y);
        
        //중간값
        int mid_X = X[M/2];
        int mid_Y = Y[M/2];
        
        int answer = 0;
        
        //중간값과의 차이의 절댓값을 누적
        for(int i=0 ; i<M ; i++) {
            answer += Math.abs(mid_X - X[i]) + Math.abs(mid_Y - Y[i]);
        }
        
        System.out.println(answer);
    }
}

