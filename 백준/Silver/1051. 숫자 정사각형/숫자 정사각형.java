import java.io.*;
import java.util.*;
 
public class Main {
    static int N,M;
    static int ans = Integer.MIN_VALUE; //초기값은 최소값으로 선정
    static int[][] map;
    
    public static void main(String[] args) throws Exception{
        //N,M중 최소값이 정사각형의 최대길이기 때문에 브루트포스 활용
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        //N,M입력 및 맵 선언
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new int[N][M];
        
        //맵 값 넣어주기
        for(int i=0; i<N; i++) {
            String str = br.readLine();
            for(int j=0; j<M; j++) {
                map[i][j] = str.charAt(j) - '0';
            }
        }
        
        // 정사각형의 최대 길이는 N과 M 중 더 작은 것
        int len = Math.min(N, M);
        
        while(len > 1) {
            for(int i=0; i<= N-len; i++) {
                for(int j=0; j<=M-len; j++) {
                    int num = map[i][j];
                    // 꼭짓점 3군데 비교
                    if(num==map[i][j+len-1] && num == map[i+len-1][j] && num == map[i+len-1][j+len-1]) {
                        System.out.println(len*len);
                        return;
                    }
                }
            }
            len--;
        }
        
        System.out.println(len*len);
        
    }
 
}
