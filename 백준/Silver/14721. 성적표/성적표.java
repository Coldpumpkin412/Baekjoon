import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        //데이터 수 N 입력
        int N = Integer.parseInt(br.readLine());
        
        int[][] arr = new int[N][2];
        
        //공부시간, 점수 입력
        for(int i=0 ; i<N ; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }
        
        //최솟값 초기값
        long min = Integer.MAX_VALUE;
        int minA = 0;
        int minB = 0;
        
        for(int i=1 ; i<=100 ; i++) {
            for(int j=1 ; j<=100 ; j++) {
                long rss = 0;
                
                for(int k=0; k<N ; k++) {
                    long cur = arr[k][0]*i + j - arr[k][1];
                    
                    rss += cur*cur;
                }
                
                if(min>rss) {
                    //최솟값 갱신
                    min = rss;
                    minA = i;
                    minB = j;
                }
            }
        }
        System.out.println(minA + " " + minB);
    }
}