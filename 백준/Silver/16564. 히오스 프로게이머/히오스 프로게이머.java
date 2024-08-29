import java.util.*;
import java.io.*;
 
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        //캐릭터 수 N, 올릴 수 있는 레벨 총합 K 입력
        st = new StringTokenizer(br.readLine()); 
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
         
        //레벨 배열 선언
        int[] level = new int[N];
 
        //최솟값, 최댓값 초기값 입력
        long min = Integer.MAX_VALUE;
        long max = Integer.MAX_VALUE;
 
        long answer = 0;
         
        //레벨 배열 값 입력 및 최솟값 갱신
        for(int i=0 ; i<N ; i++){
            level[i] = Integer.parseInt(br.readLine());
            min = Math.min(min, level[i]);
        }
        
        while(min <= max) {
            long mid = (max+min) / 2;
            long sum = 0;
            
            for(int i=0 ; i<N ; i++) {
                if(mid >= level[i]) {
                    sum += mid-level[i];
                }
            }
            
            if(K >= sum) {
                min = mid + 1;
                
                //정답 갱신
                answer = Math.max(answer, mid);
            }else {
                max = mid - 1;
            }
        }
        
        System.out.println(answer);
    }
}