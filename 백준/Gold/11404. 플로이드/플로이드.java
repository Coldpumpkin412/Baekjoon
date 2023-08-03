import java.util.*;
import java.io.*;

public class Main {
	//최댓값 변수
	static int INF = 987654321;
	
    public static void main(String[] args) throws IOException{
    	//플로이드 워셜 알고리즘 활용하기
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st;
    	StringBuilder sb = new StringBuilder();
    	
    	//도시의 개수 N 입력 및 도시 배열 선언
    	int N = Integer.parseInt(br.readLine());
    	int[][] cities = new int[N][N];
    	
    	//버스의 개수 M 입력
    	int M = Integer.parseInt(br.readLine());
    	
    	//초기값 설정
    	for(int i=0 ; i<N ; i++) {
    		for(int j=0 ; j<N ; j++) {
    			//시작도시와 도착도시가 같은 경우 0, 아니면 최댓값으로
    			cities[i][j] = i==j ? 0 : INF;
    		}
    	}
    	
    	//버스 정보 입력
    	while(M-->0) {
    		//시작도시 u, 도착도시 v, 이동하는데 드는 비용(가중치) w 입력
    		st = new StringTokenizer(br.readLine());
    		int u = Integer.parseInt(st.nextToken());
    		int v = Integer.parseInt(st.nextToken());
    		int w = Integer.parseInt(st.nextToken());
    		
    		//기존값과 w중에 작은 값으로 최신화(최소비용이기 때문)
    		cities[u-1][v-1] = Math.min(cities[u-1][v-1], w);
    	}
    	
    	//플로이드 워셜 알고리즘 활용(다른도시를 경유해서 가는 경우가 더 적은 비용이 드는지 확인)
    	for(int k=0 ; k<N ; k++) {
    		for(int i=0 ; i<N ; i++) {
        		for(int j=0 ; j<N ; j++) {
					cities[i][j] = Math.min(cities[i][j], cities[i][k]+cities[k][j]);
        		}
        	}
    	}
    	
    	//정답 저장(갈 수 없는 곳은 0으로 저장)
    	for(int i=0 ; i<N ; i++) {
    		for(int j=0 ; j<N ; j++) {
    			if(cities[i][j]>=INF) {
    				sb.append("0 ");
    			}else {
        			sb.append(cities[i][j]+" ");
    			}
    		}
    		sb.append("\n");
    	}
    	
    	System.out.println(sb);
    }
}	
