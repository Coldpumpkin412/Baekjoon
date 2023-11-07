import java.util.*;
import java.io.*;

class Node{
	int index;
	int depth;
	
	Node(int index, int depth){
		this.index = index;
		this.depth = depth;
	}
}

public class Main {
	static int N;
	
	static List<Node> list[];
	
	//정답변수 선언 및 초기화
	static int answer = 0;
	
	//방문처리변수
	static boolean[] visited;
	
	static void DFS(int number, int length) {
		//리스트에 있는 노드값들에 대해
		for(Node node : list[number]) {
			//방문한적이 없다면
			if(!visited[node.index]) {
				//방문처리 후 재귀 호출
				visited[node.index] = true;
				
				//재귀호출시 가중치만큼 더하여 길이 확보
				DFS(node.index, node.depth + length);
			}
		}
		
		//트리 지름 최댓값으로 최신화
		answer = Math.max(answer, length);
	}

    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st;
    	
    	//노드의 개수 N 입력
    	N = Integer.parseInt(br.readLine());
    	
    	//활용할 리스트선언(1~N까지)
    	list = new ArrayList[N+1];
    	for(int i=1 ; i<=N ; i++) {
    		list[i] = new ArrayList<Node>();
    	}
    	
    	//간선 정보 입력(정점 개수-1개)
    	for(int i=1 ; i<=N-1 ; i++){
    		//순서대로 부모노드 번호, 자식노드 번호, 가중치 입력
    		st = new StringTokenizer(br.readLine());
    		int parent = Integer.parseInt(st.nextToken());
    		int child = Integer.parseInt(st.nextToken());
    		int weight = Integer.parseInt(st.nextToken());
    		
    		//리스트에 정보저장(양방향)
    		list[parent].add(new Node(child, weight));
    		list[child].add(new Node(parent, weight));
    	}
    	
    	for(int i=1 ; i<=N ; i++) {
    		//방문처리 변수 선언 및 방문처리
    		visited = new boolean[N+1];
    		
    		visited[i] = true;
    		
    		//DFS함수 실행
    		DFS(i, 0);
    	}
    	
    	System.out.println(answer);
    }
}	
