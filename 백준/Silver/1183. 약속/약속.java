import java.util.*;
import java.io.*;
 
public class Main {
   public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       StringTokenizer st;
       //N입력
       int N = Integer.parseInt(br.readLine());
       
       //기다리는 시간의 합 |A+T-B| 에서 |A-B| 값을 저장할 배열 선언
       
       int[] input = new int[N];
       
       for(int i=0 ; i<N ; i++) {
          st = new StringTokenizer(br.readLine());
           
          input[i] = Integer.parseInt(st.nextToken())-Integer.parseInt(st.nextToken());
       }
       
       //중앙값을 알기 쉽게 오름차순 정렬
       Arrays.sort(input);
         
       //홀수인 경우 1을 출력
       if(N%2 == 1){
           System.out.println(1);
       }else{ //홀수가 아니라면 중앙값 두 개를 빼준 후 1 더해주기
           System.out.println(Math.abs(input[N/2]-input[N/2-1])+1);
       } 
   }
}