import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        //테스트케이스 개수 T 입력
        int T = Integer.parseInt(br.readLine());
       
        while(T-->0) {
            st = new StringTokenizer(br.readLine());
            int M = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());

            int count = 0;  //0의 개수(이동거리)
            int[][] box = new int[M][N];    //박스
            
            for (int i=0 ; i<M ; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j=0 ; j<N ; j++)
                    box[i][j] = Integer.parseInt(st.nextToken());
            }

            
            for(int i=0 ; i<N ; i++) {
                for (int j=0 ; j<M ; j++) {
                    if(box[j][i] == 1) {
                        // 현재위치 아래 칸부터 끝까지 0 개수 세기 (이동거리)
                        for (int k = j+1 ; k<M ; k++) {
                            if (box[k][i] == 0){
                                count++;
                            }
                                
                        }
                    }
                }
            }
            System.out.println(count);
        }
    }
}