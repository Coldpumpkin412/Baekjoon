import java.util.*;
import java.io.*;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));        
    
        //드라이버 수 N 입력
        int N = Integer.parseInt(br.readLine());

        //점수 배열 선언 및 입력
        int[] B = new int[N];
        for(int i=0 ; i<N ; i++) {
            B[i] = Integer.parseInt(br.readLine());
        }
            
        //오름차순 정렬
        Arrays.sort(B);

        //점수 초기값
        int score = B[N-1];
        int count = 1;
        
        for(int i=N-2 ; i>=0 ; i--) {
            if(B[i]+N < score){
                break;
            }
            
            count++;
            
            //점수 최신화
            score = Math.max(score, B[i]+N-i);
        }

        System.out.println(count);
    }
}