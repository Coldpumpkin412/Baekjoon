import java.util.*;
import java.io.*;
import java.math.*;

public class Main{
    public static void main(String[]args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        //직사각형 개수 N 입력
        int N = Integer.parseInt(br.readLine());
        
        //방문 배열
        boolean[][] visit = new boolean[501][501];
        
        int count = 0;
        
        while(N-->0){
            //직사각형 N개의 각각 양 끝 꼭짓점 좌표(x1, y1, x2, y2) 입력
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            
            for(int i=y1 ; i<y2 ; i++){
                for(int j=x1 ; j<x2 ; j++){
                    visit[j][i] = true;
                }
            }
        }
        
        for(int i=0 ; i<501 ; i++){
            for(int j=0 ; j<501 ; j++){
                if(visit[i][j]){
                    count++;
                }
            }
        }
        
        System.out.println(count);
    }
}