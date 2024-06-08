import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        //대기명단의 적힌 수의 개수 N, 민규 친구의 수 M 입력
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        int[] list = new int[N];
        int[] friend = new int[M];
        
        int answer = 0;
        
        //대기명단에 적힌 수 입력
        st = new StringTokenizer(br.readLine());
        for(int i=0 ; i<N ; i++) {
            list[i] = Integer.parseInt(st.nextToken());
        }
        
        //민규 친구 대기번호 입력
        st = new StringTokenizer(br.readLine());
        for(int i=0 ; i<M ; i++) {
            friend[i] = Integer.parseInt(st.nextToken());
        }

        for(int i=0 ; i<M ; i++) {
            for(int j=0;j<M;j++) {
                if(list[j] == friend[i]) {
                    answer++;
                }
            }
        }
        
        System.out.println(M - answer);
    }
}