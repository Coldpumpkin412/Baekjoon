import java.util.*;
import java.io.*;

public class Main {
	
	//노드 클래스 생성
	static class Node{
		char value;
		Node LEFT;
		Node RIGHT;
		
		//생성자
		Node(char value, Node LEFT, Node RIGHT){
			this.value = value;
			this.LEFT = LEFT;
			this.RIGHT = RIGHT;
		}
	}
	
	//루트노드 미리 입력해놓기
	static Node HEAD = new Node('A', null, null);
	
	//노드삽입함수
	static void InsertNode(Node nd, char ROOT, char LEFT, char RIGHT) {
		//루트노드인지 확인
		if(nd.value==ROOT) {
			//자식노드가 '.' 이면 null을, 아니면 새로운 노드 생성
			nd.LEFT = (LEFT=='.') ? null : new Node(LEFT, null, null);
			nd.RIGHT = (RIGHT=='.') ? null : new Node(RIGHT, null, null);
		}else { //루트노드가 아닌경우 해당 노드를 헤드로 하여금 재귀적으로 호출
			if(nd.LEFT != null) {
				InsertNode(nd.LEFT, ROOT, LEFT, RIGHT);
			}
			if(nd.RIGHT != null) {
				InsertNode(nd.RIGHT, ROOT, LEFT, RIGHT);
			}
		}
	}
	
	//전위순회
	static void PreOrder(Node n) {
		if(n == null) return;
		
		System.out.print(n.value);
		PreOrder(n.LEFT);
		PreOrder(n.RIGHT);
	}
	
	//중위순회
	static void InOrder(Node n) {
		if(n == null) return;
		
		InOrder(n.LEFT);
		System.out.print(n.value);
		InOrder(n.RIGHT);
	}
	
	//후위순회
	static void PostOrder(Node n) {
		if(n == null) return;
		
		PostOrder(n.LEFT);
		PostOrder(n.RIGHT);
		System.out.print(n.value);
	}
	
	public static void main(String[] args) throws IOException{
		/*
		 * 전위순회 : 루트 - 좌측자식노드 - 우측자식노드
		 * 중위순회 : 좌측자식노드 - 루트 - 우측자식노드
		 * 후위순회 : 좌측자식노드 - 우측자식노드 - 루트
		 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		//이진 트리의 노드 개수 N 입력
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		
		//각 노드와 왼쪽, 오른쪽 자식 입력(노드 이름은 A(루트노드)부터 시작)
		while(N-->0) {
			st = new StringTokenizer(br.readLine());
			
			char ROOT = st.nextToken().charAt(0);
			char LEFT = st.nextToken().charAt(0);
			char RIGHT = st.nextToken().charAt(0);
			
			//노드에 삽입하는 함수
			InsertNode(HEAD, ROOT, LEFT, RIGHT);
		}
		        
        //결과
		PreOrder(HEAD);
		System.out.println();
		
		InOrder(HEAD);
		System.out.println();
		
		PostOrder(HEAD);
		System.out.println();
		
    }
}	
