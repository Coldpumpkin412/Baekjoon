import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        //운동기구 개수 N입력
        int N = Integer.parseInt(br.readLine());
        
        //근손실 정도를 나타내는 배열 선언
        long[] weight = new long[N];
        
        //근손실 정도 입력
        st = new StringTokenizer(br.readLine());
        for(int i=0 ; i<N ; i++) {
            weight[i] = Long.parseLong(st.nextToken());
        }
        
        //오름차순 정렬
        Arrays.sort(weight);
        long max = 0;
        
        //기구가 짝수인 경우
        if(N%2 == 0){
            for(int i=0 ; i<N/2 ; i++) {
                max = Math.max(max, weight[i]+weight[N-1-i]);
            }
        }else{
            max = weight[N-1];
            
            for(int i=0 ; i<(N-1)/2 ; i++){
                max = Math.max(max, weight[i]+weight[N-2-i]);
            }
        }


        System.out.println(max);
    }
}