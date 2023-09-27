import java.util.*;
import java.io.*;

public class Main {
	//숫자 저장배열 및 방문처리 배열
	static int[] num;
	static boolean[] visited;
	
	static StringBuilder sb = new StringBuilder();
	
	public static void DFS(int N, int depth) {
		//노드의 깊이가 N과 같아지면
		if(depth == N) {
			//저장된 배열 출력 후 종료
			for(int number : num) {
				sb.append(number+" ");
			}
			
			//개행 후 종료
			sb.append("\n");
			return;
		}
		
		//N까지 모두 실행
		for(int i=0 ; i<N ; i++) {
			//방문한 적 없다면
			if(!visited[i]) {
				//방문처리
				visited[i] = true;
				
				//배열에 값 입력
				num[depth] = i+1;
				
				//재귀호출
				DFS(N, depth+1);
				
				//재귀끝날때 다시 방문처리취소
				visited[i] = false;
			}
		}
	}
	
    public static void main(String[] args) throws IOException{
    	//DFS활용하기
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	//N입력
    	int N = Integer.parseInt(br.readLine());
    	
    	num = new int[N];
    	visited = new boolean[N];
    	
    	//DFS함수 실행
    	DFS(N, 0);
    	
    	System.out.println(sb);
    }
}	
