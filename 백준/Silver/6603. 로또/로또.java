import java.util.*;
import java.io.*;

public class Main {
	static int k;
    static int[] S;
    static boolean[] visited;
    static int[] result;
    static StringBuilder sb;
    
    
    //dfs함수
    static void dfs(int start, int depth) {
    	//깊이가 6이되면 함수 종료
        if(depth==6){
            for(int val : result){
                sb.append(val).append(" ");
            }
            sb.append("\n");
            return;
        }

        for(int i=start ; i<k ; i++){
        	
        	//방문한 적이 없으면
            if(!visited[i]){
            	//방문처리
                visited[i] = true;
                
                //결과저장
                result[depth] = S[i];
                
                //재귀적 호출
                dfs(i, depth+1);
                
                //재귀함수 끝나면 다시 초기화
                visited[i] = false;
            }
        }
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        while(true){
            sb = new StringBuilder();
            
            //k값 입력
        	st = new StringTokenizer(br.readLine());
            k = Integer.parseInt(st.nextToken());
            
            //0이 입력되면 루프 종료
            if(k==0) {
            	break;
            }
            
            //집합S배열 및 결과배열 및 방문처리 배열 선언
            S = new int[k];
            result = new int[6];
            visited = new boolean[k];
            
            for (int i=0 ; i<k ; i++){
            	//집합 S에 포함되는 수 입력
                S[i] = Integer.parseInt(st.nextToken());
            }
            
            //dfs함수 실행
            dfs(0, 0);

            System.out.println(sb);
        }
    }
}	
