import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        //N, K 입력
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        long K = Long.valueOf(st.nextToken());

        int[] course = new int[N+1];
        boolean check = false;        

        //입력
        st = new StringTokenizer(br.readLine());
        for(int i=0 ; i<N ; i++) {
            course[i] = Integer.parseInt(st.nextToken());
        }

        //계산
        for(int i=0 ; i<N ; i++) {
            K -= course[i];
            
            if(K < 0){
                System.out.println(i+1);
                check = true;
                break;
            }
        }

        if(!check){
            for(int i=N-1 ; i>=0; i--) {
                K -= course[i];
                
                if(K < 0){
                    System.out.println(i+1);
                    break;
                }
            }
        }
    }
}