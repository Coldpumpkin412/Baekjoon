import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        //아이스크림 종류 N, 섞으면 안되는 조합의 개수 M 입력
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        boolean[][] pairs = new boolean[N+1][N+1];

        //섞으면 안되는 조합                                 
        while(M-->0) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            
            //양방향으로 true
            pairs[a][b] = true;
            pairs[b][a] = true;
        }

        int answer = 0;
                                 
        for(int i=1 ; i<=N ; i++) {
            for(int j=i+1 ; j<=N ; j++){
                if(pairs[i][j]) {
                    //안맞는 조합인 경우
                    continue;     
                } 
                
                for(int k=j+1 ; k<=N ; k++) {
                    if(!pairs[j][k] && !pairs[k][i]){ 
                        answer++;
                    }
                }
            }
        }
                                 
        System.out.println(answer);
    }
}