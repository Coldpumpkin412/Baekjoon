import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        //주문한 막걸리 주전자 수 N, 은상이 포함 친구 수 K 입력
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        
        //주전자 배열 선언 및 최댓값 선언
        int[] arr = new int[N];
        int max = 0;

        //주전자 용량 입력 및 최댓값 갱신
        for(int i=0 ; i<N ; i++){ 
            arr[i] = Integer.parseInt(br.readLine());
            max = Math.max(max, arr[i]);
        }
        
        long low = 1;
        long high = max;

        while (low <= high) {
            //중간값
            long mid = (low + high) / 2;
            int count = 0;

            for(int i=0 ; i<N ; i++) {
                count += arr[i]/mid;
            }
            // 부을 양이 mid일 때, 모두에게 막걸리를 줄 수 있는경우
            if(count >= K){
                low = mid + 1;
            }else {
                high = mid - 1;
            }
        }
        
        System.out.println(high);
    }
}