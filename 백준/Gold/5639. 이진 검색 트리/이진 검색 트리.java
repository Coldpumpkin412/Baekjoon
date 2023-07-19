import java.util.*;
import java.io.*;

public class Main {
	//노드클래스 생성
	static class Node{
		//루트노드와 왼쪽자식노드, 오른쪽 자식노드
		int value;
		Node left;
		Node right;
		
		//생성자(오버로딩)
		Node(int value){
			this.value = value;
		}
		
		//생성자(오버로딩)
		Node(int value, Node left, Node right){
			this.value = value;
			this.left = left;
			this.right = right;
		}
		
		//노드삽입함수
		void InsertNode(int node) {
			//입력값이 루트보다 작은경우
			if(node < this.value) {
				if(this.left == null) { //왼쪽자식이 비어있으면 자식노드 생성
					this.left = new Node(node);
				}else { //비어있지않으면 재귀적 호출
					this.left.InsertNode(node);
				}
			}else {//입력값이 루트보다 큰 경우
				if(this.right == null) { //오른쪽 자식이 비어있으면 자식노드 생성
					this.right = new Node(node);
				}else { //비어있지않으면 재귀적호출
					this.right.InsertNode(node);
				}
			}
		}
	}
    
    //후위순회함수
	static void PostOrder(Node n) {
		if(n == null) {
			return;
		}
		
		PostOrder(n.left);
		PostOrder(n.right);
		System.out.println(n.value);
	}
	
    public static void main(String[] args) throws IOException{
    	/*
    	 * 이진검색트리를 전위순회로 한 값이 주어지기 때문에 맨 처음 입력값이 무조건 루트.
    	 * 이후부터는 루트를 기준으로 작은값은 왼쪽, 큰 값은 오른쪽으로 배치
    	 */
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	String input;
    	
    	//첫 입력값은 루트변수에 저장
    	Node root = new Node(Integer.parseInt(br.readLine()));
    	
    	//전위순회 값 입력
    	while(true) {
    		input = br.readLine();
    		
    		if(input==null || input.equals("")) {
    			break;
    		}
    		
    		//노드삽입함수
    		root.InsertNode(Integer.parseInt(input));
    	}
    	
    	//후위순회 출력
    	PostOrder(root);
    }
}	
