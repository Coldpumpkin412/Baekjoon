import java.util.*;
import java.io.*;
 
public class Main {    
    public static void main(String[] args) throws Exception {        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
 
        //테스트케이스 개수 T 입력
        int T = Integer.parseInt(br.readLine());
 
        while(T-->0) {            
            //사료양 N 입력
            int N = Integer.parseInt(br.readLine());
            
            int day = 1;
            
            //식사량 합
            long sum = 0;
            
            //먹었던 식사량 입력하여 누적값 갱신
            st = new StringTokenizer(br.readLine());
            for(int i=0 ; i<6 ; i++) {
                sum += Integer.parseInt(st.nextToken());
            }
 
            while(sum <= N) {
                sum *= 4;
                ++day;
            }
  
            sb.append(day).append("\n");
        }
 
        System.out.print(sb.toString());
    }
}