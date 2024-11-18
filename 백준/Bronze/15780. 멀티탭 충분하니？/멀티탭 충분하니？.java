import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        //학생 수 N, 멀티탭 수 K 입력
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        
        //총 꽂을 수 있는 수
        int count = 0;
        
        //멀티탭 별로 구의 수 저장할 배열 선언 및 값 입력
        int[] A = new int[K];
        
        st = new StringTokenizer(br.readLine());
        for(int i=0 ; i<K ; i++){
            A[i] = Integer.parseInt(st.nextToken());
            
            //구의 수가 짝수일 경우
            if(A[i]%2 == 0){
                count += A[i]/2;
            }else{
                count += A[i]/2+1;
            }
        }
        
        System.out.println((N<=count) ? "YES" : "NO");
    }
}