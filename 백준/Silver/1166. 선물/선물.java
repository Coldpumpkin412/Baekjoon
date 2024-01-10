import java.util.*;
import java.io.*;
 
public class Main {
   public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       StringTokenizer st;
       
       //박스개수 N, 박스 크기 L,W,H 입력
       st = new StringTokenizer(br.readLine());
       int N = Integer.parseInt(st.nextToken());
       int L = Integer.parseInt(st.nextToken());
       int W = Integer.parseInt(st.nextToken());
       int H = Integer.parseInt(st.nextToken());
 
       //이분탐색 활용하여 풀기(관련 변수 선언)
       double low = 0;
       double high = Math.min(L, Math.min(W,H));
       double mid;
       
       while(low<high){
          mid = (low+high)/2;
 
          if((long)(L/mid)*(long)(W/mid)*(long)(H/mid)<N){
             if(high==mid){
               break;  
             } 
              
             high = mid;
          } else{
            if(low==mid){
              break;  
            } 
              
            low = mid;
         }           
       }
       
       System.out.println(low);
   }
}