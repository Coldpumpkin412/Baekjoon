import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        
        //카드 개수 N, 섞은 횟수 K 입력
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        
        //K번 카드 섞은후 배치 입력 배열
        int[] arr = new int[N+1];

        st = new StringTokenizer(br.readLine());
        for(int i=1 ; i<=N ; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        //D 배열
        int[] D = new int[N+1];
        
        st = new StringTokenizer(br.readLine());
        for(int i=1 ; i<=N ; i++) {
            D[i] = Integer.parseInt(st.nextToken());
        }
        
        //임시 저장 배열 선언 후 넣어주기
        for(int i=0 ; i<K ; i++) {
            int[] tmp = new int[N+1];
            
            for(int j=1 ; j<=N ; j++) {
                tmp[D[j]] = arr[j];
            }
            arr = tmp;
        }
        
        //결과
        for(int i=1 ; i<=N ; i++) {
            sb.append(arr[i]+ " ");
        }
        System.out.println(sb.toString());

    }
}