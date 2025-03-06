import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        //돌봐야하는 시간 T 입력
        int T = Integer.parseInt(br.readLine());
        
        //사탕의 개수 N 입력
        int N = Integer.parseInt(br.readLine());
        
        //울음 멈추는 시간 변수
        int sum = 0;
        
        //각 멈추는 시간 입력 및 누적합 갱신
        st = new StringTokenizer(br.readLine());
        for(int i=0 ; i<N ; i++){
            sum += Integer.parseInt(st.nextToken());
        }
        
        //삼항 연산자 활용
        System.out.println((sum>=T) ? "Padaeng_i Happy" : "Padaeng_i Cry");
    }
}