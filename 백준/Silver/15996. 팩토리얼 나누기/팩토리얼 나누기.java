import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        /*
         *  N!을 A^K로 나누었을 때 나머지가 0이되는 최대 K값 구하기
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        //N, A 입력
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int A = Integer.parseInt(st.nextToken());

        int answer = 0;
        
        //초기 result값은 A로 설정
        int result = A;
        
        //result가 N의약수가 아닐때 까지
        while(N/result != 0){
            //N 및 정답 변수 갱신
            N /= result;
            answer += N;
        }

        System.out.println(answer);
    }
}