import java.util.*;
import java.io.*;
import java.math.*;


public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;        
        StringBuilder sb = new StringBuilder();
        
        //테스트케이스 개수 T 입력
        int T = Integer.parseInt(br.readLine());
        
        while(T-->0) {
            //M, N 입력
            st = new StringTokenizer(br.readLine());
            int M = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());
            
            //배열 선언 및 초기화
            BigInteger[] arr = new BigInteger[M];
            for(int i=0 ; i<M ; i++) {
                arr[i] = BigInteger.ONE;
            }
            
            //배열값 입력
            while(N-->0) {
                st = new StringTokenizer(br.readLine());
                for (int i=0 ; i<M ; i++) {
                    arr[i] = arr[i].multiply(new BigInteger(st.nextToken()));
                }
            }
            
            //최댓값
            BigInteger max = arr[0];
            
            int index = 0;
            
            for(int i=1 ; i<M ; i++) {
                if(max.compareTo(arr[i])<=0) {
                    max = arr[i];
                    index = i;
                }
            }
            sb.append(index+1).append('\n');
        }
        
        System.out.print(sb.toString());
        
    }
}