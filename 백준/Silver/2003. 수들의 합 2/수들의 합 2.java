import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        //구간합 관련된 문제에서는 투포인터 알고리즘 활용
        //투포인터 : 배열의 특정 연속된 구간에 대해 O(N)의 시간복잡도로 풀 수 있음
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        //N, M 입력
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        //배열값 입력
        st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        for (int i=0 ; i<N ; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        //더해갈 변수 및 지점들 선언
        int sum=0;
        int start=0;
        int end=0;
        int count=0;

        while(true){
            if(sum >= M) sum -= arr[start++];
            else if(end == N) break;
            else sum += arr[end++];
            
            //M에 도달하면 개수 늘려주기
            if(sum == M) count++;            
        }
        
        System.out.println(count);
    }
}