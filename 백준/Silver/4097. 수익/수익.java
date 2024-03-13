import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        //여러개의 테스트케이스
        while(true){
            //최댓값 및 누적합 변수 선언
            int max = Integer.MIN_VALUE;
            int sum = 0;
            
            //N 입력
            int N = Integer.parseInt(br.readLine());
            
            //N이 0이라면 종료
            if(N == 0){
                return;
            }
            
            while(N-->0){
                //수익 P 입력
                int P = Integer.parseInt(br.readLine());
                
                //누적합
                sum += P;
                
                //최댓값 갱신
                max = Math.max(max, sum);
                
                //누적합이 음수라면 0으로 초기화
                if(sum < 0){
                    sum = 0;
                }
            }
            
            //누적합의 최댓값 출력
            System.out.println(max);
        }
    }
}