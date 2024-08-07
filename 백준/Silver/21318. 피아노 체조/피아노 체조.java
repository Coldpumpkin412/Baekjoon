import java.util.*;
import java.io.*;

public class Main {
 
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        
        //악보 개수 N 입력
        int N = Integer.parseInt(br.readLine());
        
        //악보 난이도 배열
        int[] arr = new int[N+1];
        
        //실수 누적횟수 배열
        int[] sum = new int[N+1];
 
        //1~N 번 악보 난이도 입력
        st = new StringTokenizer(br.readLine());
        for(int i=1 ; i<=N ; i++) {
            arr[i] = Integer.parseInt(st.nextToken());            
        }
        
        for(int i=1 ; i<=N ; i++) {
            if(arr[i-1] > arr[i]) {
                sum[i] += sum[i-1] + 1;
            }else {
                sum[i] = sum[i-1];
            }
        }
         
        //질문의개수 Q 입력
        int Q = Integer.parseInt(br.readLine());
         
        while(Q-->0) {
            st = new StringTokenizer(br.readLine());
            
            //시작 악보번호 X, 끝 악보번호 Y 입력
            int X = Integer.parseInt(st.nextToken());
            int Y = Integer.parseInt(st.nextToken());
            
            sb.append(sum[Y]-sum[X]).append("\n");            
        }
        
        
        System.out.println(sb.toString());
    }
}