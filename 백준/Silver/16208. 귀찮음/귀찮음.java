import java.util.*;
import java.io.*;

public class Main {
 
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
 
        int N = Integer.parseInt(br.readLine()); // 필요한 쇠막대기의 수
 
        long[] arr = new long[N]; // 필요한 쇠막대기 배열.
        long total = 0; // 현우가 가지고 있는 쇠막대기의 길이(arr 배열의 모든 요소의 합)
 
        st = new StringTokenizer(br.readLine());
        for (int i=0 ; i<N ; i++) {
            arr[i] = Long.parseLong(st.nextToken());
            total += arr[i];
        }
 
        long answer = 0;
 
        // 연속해서 쇠막대를 2개로 분리하고, 그 2개의 곱을 구하는 과정.
        for (int i=0 ; i<N ; i++) {
            long temp = arr[i];
            total -= temp;
            answer += temp * total;
        }
 
        System.out.println(answer);
    }
 
}
