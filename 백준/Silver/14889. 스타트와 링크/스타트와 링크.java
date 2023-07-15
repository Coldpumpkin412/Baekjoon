import java.util.*;
import java.io.*;

public class Main{
     static int[][] board;
     static boolean[] visited;
     static int N;
     static int Min = Integer.MAX_VALUE;
     
     //dfs함수
     public static void dfs(int idx, int depth){
         if(depth == N/2){
             int startTeam = 0, linkTeam = 0;
 
             for(int i=0 ; i<N-1 ; i++){
                 for(int j=i+1 ; j<N ; j++){ 
                     
                     // 중복 방지
                     if(visited[i] && visited[j]){
                         startTeam += board[i][j];
                         startTeam += board[j][i];
                     }
                     else if(!visited[i] && !visited[j]){
                         linkTeam += board[i][j];
                         linkTeam += board[j][i];
                     }
                 }
             }
 
             // 두 팀의 점수 차이(abs로 절댓값 활용)
             int val = Math.abs(startTeam-linkTeam);
 
             if(val==0){
                 System.out.println(val);
                 System.exit(0);
             }
 
             Min = Math.min(val, Min);
             return;
         }
 
         for(int i=idx ; i<N ; i++){
             if(!visited[i]){
                 visited[i] = true;
                 
                 dfs(i+1, depth+1);
                 //dfs함수 끝나면 다시 false로
                 visited[i] = false;
             }
         }
     }
 
     public static void main(String[] args) throws IOException{
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         StringTokenizer st;
         
         //N 입력
         N = Integer.parseInt(br.readLine());
         
         //맵 및 방문처리배열 선언
         board = new int[N][N];
         visited = new boolean[N];
         
         
         //맵 점수 입력
         for(int i=0 ; i<N ; i++){
             st = new StringTokenizer(br.readLine());
             
             for (int j=0 ; j<N ; j++) {
                 board[i][j] = Integer.parseInt(st.nextToken());
             }
         }
 
         dfs(0, 0);
 
         System.out.println(Min);
     }
 }