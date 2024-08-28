import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        //벌여놓은 일의 수 N, 몇 개의 일을 처리할 수 있는지 알아볼 개수 M 입력
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        int[] t_arr = new int[N+1];
        
        //N개의 정수 t 입력
        st = new StringTokenizer(br.readLine());
        for(int i=0 ; i<N ; i++) {
            t_arr[i+1] = t_arr[i] + Integer.parseInt(st.nextToken());
        }
        
        while(M-->0) {
            //T 입력
            int T = Integer.parseInt(br.readLine());
            
            int left = 1;
            int right = N;
            
            //이분탐색
            while(left <= right) {
                int mid = (left+right) / 2;
                if(t_arr[mid] > T) {
                    right = mid-1;
                }else {
                    left = mid+1;
                }
            }
            System.out.println(right);
        }
    }
}