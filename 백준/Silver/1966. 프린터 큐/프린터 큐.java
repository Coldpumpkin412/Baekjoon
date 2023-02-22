import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//문서의 중요도를 저장할 큐, 그 때 당시의 인덱스를 저장할 큐 두 개 선언
		Queue<Integer> importance = new LinkedList<>();
		Queue<Integer> index = new LinkedList<>();
		
		//테스트케이스의 수 T 입력
		int T = sc.nextInt();
		
		//문서의 개수 N, 인쇄 순서가 궁금한 문서의 위치(인덱스) M 입력
		for(int i=0 ; i<T ; i++) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			
			//N개의 문서의 중요도 각각 입력 후 중요도큐에 저장, 그에 따른 인덱스 또한 인덱스 큐에 저장
			for(int j=0 ; j<N ; j++) {
				int num = sc.nextInt();
				
				importance.offer(num);
				index.offer(j);
			}
			//인덱스 큐의 헤드값이 M과 일치하며 추출 되는경우 count 값 출력
			int count = 0;
			while(index.size() != 0) {
				//중요도 큐의 최댓값
				int max = Collections.max(importance);
				
				//최댓값이면서 찾고자하는 문서의 차례일 때
				if(importance.peek()==max && index.peek()==M) {
					count++;
					System.out.println(count);
					break;
				}else if(importance.peek()==max && index.peek()!=M) { //최댓값이지만 찾고자하는 문서가 아니라면
					//출력 후 카운트 증가
					importance.poll();
					index.poll();
					
					count++;
				}else { //헤드값이 최댓값이 아닌경우
					//출력 후 뒤로 보내기 
					importance.offer(importance.poll());
					index.offer(index.poll());
				}
			}
			
            //다음 테스트 케이스를 위해 큐 초기화
			importance.clear();
			index.clear();
		}
		
	}
}

	
