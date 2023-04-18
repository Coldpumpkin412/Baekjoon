import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        /*
         * 결국 문자열 A와 B의 '현재' 최소한의 차이인 부분을 찾는 문제
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        //문자열 A,B 입력
        st = new StringTokenizer(br.readLine());
        String A = st.nextToken();
        String B = st.nextToken();
        
        //비교대상인 문자열 A의 길이
        int answer = A.length();

        for (int i=0 ; i<B.length() - A.length()+1 ; i++) {
            int count = 0;
            
            //A문자열의 길이만큼 비교
            for (int j=0 ; j<A.length() ; j++) {
                //다른부분이 있다면 증가
                if (A.charAt(j) != B.charAt(j+i)) {
                    count++;
                }
            }
            //정답을 최솟값으로 갱신
            answer = Math.min(answer, count);
        }
        
        System.out.println(answer);
    }
}