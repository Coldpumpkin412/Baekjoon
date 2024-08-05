import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        //구멍 개수 N, 부피 M 입력
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        //구멍크기 배열선언
        int[] hole = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i=0 ; i<N ; i++){
            hole[i] = Integer.parseInt(st.nextToken());
        }
        
        int index = 0;
        int sum = 0;
        long answer = 0;
        
        for(int i=0 ; i<N ; i++){
            sum += hole[i];
            
            while(sum > M){
                sum -= hole[index++];
            }
            
            //최댓값으로 갱신
            answer = Math.max(answer, sum);
        }
        System.out.println(answer);
    }
}