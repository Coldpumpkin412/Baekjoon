import java.util.*;
import java.io.*;

public class Main {
 
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        int i;
        
        //호반우 개수 N 입력
        int N = Integer.parseInt(br.readLine());
        
        //호반우 품질 배열
        int[] arr = new int[N];
        
        //품질 입력
        st = new StringTokenizer(br.readLine());
        for(i=0 ; i<N ; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
 
        //오름차순 정렬
        Arrays.sort(arr);
        
        int sum = 0;
        
        if(N%2 == 0) { //짝수
            for(i=N-1 ; i>=N/2 ; i--) {
                sum += arr[i] * 2; 
            }
        }else { //홀수
            for(i=N-1 ; i>N/2 ; i--) {
                sum += arr[i] * 2; 
            }
            
            sum += arr[i]; 
        }
        
        System.out.println(sum);
    }
}
