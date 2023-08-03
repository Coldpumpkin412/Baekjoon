import java.util.*;
import java.io.*;

public class Main {
	
	static int INF = 987654321;
	
    public static void main(String[] args) throws IOException{
    	//플로이드 워셜 알고리즘 활용하기
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st;
    	
    	//학생 수(N), 단방향 도로의 수(M), 모이는 마을의 번호(X) 입력
    	st = new StringTokenizer(br.readLine());
    	int N = Integer.parseInt(st.nextToken());
    	int M = Integer.parseInt(st.nextToken());
    	int X = Integer.parseInt(st.nextToken());
    	
    	//마을 배열 선언 및 초기값 선언
    	int[][] village = new int[N][N];
    	for(int i=0 ; i<N ; i++) {
    		for(int j=0 ; j<N ; j++) {    			
    			village[i][j] = (i==j) ? 0 : INF;
    		}
    	}
    	
    	//도로의 시작점(u), 끝점(v), 소요시간 T 입력 (도로의 최대개수는 1개)
    	while(M-->0) {
    		st = new StringTokenizer(br.readLine());
    		int u = Integer.parseInt(st.nextToken());
    		int v = Integer.parseInt(st.nextToken());
    		int T = Integer.parseInt(st.nextToken());
    		
    		village[u-1][v-1] = T;
    	}
    	
    	//각자 마을까지 가는 최단거리를 미리 셋팅하기 위해 플로이드워셜 활용
    	for(int k=0 ; k<N ; k++) {
    		for(int i=0 ; i<N ; i++) {
    			for(int j=0 ; j<N ; j++) {
    				village[i][j] = Math.min(village[i][k]+village[k][j], village[i][j]);
    			}
    		}
    	}
    	    	
    	//X번 마을까지 갔다가 오는 최단거리 중의 최댓값 구하기
    	int answer = 0;
    	for(int i=0 ; i<N ; i++) {
    		answer = Math.max(village[i][X-1]+village[X-1][i], answer);
    	}
    	
    	System.out.println(answer);
    }
}	
