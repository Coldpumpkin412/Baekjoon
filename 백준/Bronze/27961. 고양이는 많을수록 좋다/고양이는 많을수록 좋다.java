import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        //원하는 고양이의 수 N 입력
        long N = Long.parseLong(br.readLine());
                                      
        //정답변수 선언 및 초기화
        int answer = 0;
                                               
        while(N > 3) {
            answer++;
            
            //N이 홀수면 1을, 짝수면 0 더해주기
            N = N/2 + (N%2==1 ? 1 : 0);
        }
                                               
        System.out.println(N+answer);
    }
}