import java.util.*;
import java.io.*;
 
public class Main {
   public static void main(String[] args) throws Exception {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       StringTokenizer st;
          
       //양동이 수 N, 거리 K 입력
       st = new StringTokenizer(br.readLine());
       int N = Integer.parseInt(st.nextToken());
       int K = Integer.parseInt(st.nextToken())*2 + 1;
 
       int[] ice = new int[1000001];
       
       for(int i=0 ; i<N ; i++){
          st = new StringTokenizer(br.readLine());
          int g = Integer.parseInt(st.nextToken());
          int x = Integer.parseInt(st.nextToken());
          ice[x] = g;
       }
       
       int sum = 0;
       int max = 0;
       for(int i=0 ; i<=1000000 ; i++){
          if(i-K >= 0){
              sum -= ice[i - K];    
          } 
           
          sum += ice[i];
           
          max = Math.max(max,sum);
       }
 
       System.out.println(max);
    }
}