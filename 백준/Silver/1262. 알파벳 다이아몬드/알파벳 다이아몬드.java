import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        //N, R1, C1, R2, C2 입력
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int R1 = Integer.parseInt(st.nextToken());
        int C1 = Integer.parseInt(st.nextToken());
        int R2 = Integer.parseInt(st.nextToken());
        int C2 = Integer.parseInt(st.nextToken());
        // 주어진 x = r1 , y = c1 좌표를 for 문을 돌려서 . 인지 알파벳인지 판별 
        // r2 , c2 좌표 까지 
        
        for(int i=0, s=R1 ; i<R2-R1+1 ; i++,s++){
            for(int j=0, t=C1 ; j<C2-C1+1 ; j++, t++){
                //x, y좌표
                int x = s%(2*N - 1); 
                int y = t%(2*N - 1); 
                
                //중간으로부터의 거리
                int distance = Math.abs(N-1-x) + Math.abs(N-1-y);
                if(distance>N-1) {
                    System.out.print("."); 
                }else {
                    System.out.print( Character.toString((distance % 26) + 'a') );
                }
            }
            
            System.out.println();
        }
    }
}