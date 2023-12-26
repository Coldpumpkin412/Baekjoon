import java.util.*;
import java.io.*;

public class Main {
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        
        //수열 A 크기 N 입력
        int N = Integer.parseInt(br.readLine());
        
        //수열 A 선언 및 값 입력
        int[] A = new int[N];
        
        st = new StringTokenizer(br.readLine());
        for(int i=0 ; i<N ; i++) {
        	A[i] = Integer.parseInt(st.nextToken());
        }
        
        //스택 선언 및 초기값 넣어주기 (스택에 넣어주는 값은 배열의 인덱스)
        Stack<Integer> stack = new Stack<>(); 
        
        //배열의 0번 인덱스 넣어주기
        stack.push(0);
        
        int index = 0;
        
        //이후 인덱스를 하나씩 넣어주며
        for(int i=1 ; i<N ; i++) {
        	//스택이 비어있지않고 현재 배열값이 스택의 헤드값보다 큰 경우
        	while(!stack.isEmpty() && A[stack.peek()]<A[i]) {
        		//해당 인덱스의 값 교체
        		A[stack.pop()] = A[i];
        	}
        	
        	//이후 인덱스 또 푸시해주기
        	stack.push(i);
        }
        
        //스택에 남아있는 인덱스들의 배열값은 -1로 바꿔준다
        while(!stack.isEmpty()) {
        	A[stack.pop()] = -1;
        }
        
        //변경된 수열을 스트링빌더에 저장
        for(int i=0 ; i<N ; i++) {
        	sb.append(A[i]).append(" ");
        }
        
        //정답 출력
        System.out.println(sb);
    }
}	
