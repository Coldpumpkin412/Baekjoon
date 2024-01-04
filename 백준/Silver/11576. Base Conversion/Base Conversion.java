import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st;
    	
    	//진법 A, B 입력
    	st = new StringTokenizer(br.readLine());
    	int A = Integer.parseInt(st.nextToken());
    	int B = Integer.parseInt(st.nextToken());
    	
    	//A진법으로 나타낸 숫자의 자리수 M입력
    	int M = Integer.parseInt(br.readLine());
    	
    	//A진법 숫자 저장 배열 선언
    	int[] num = new int[M+1];
    	
    	//A진법의 숫자 M개 입력
    	st = new StringTokenizer(br.readLine());
    	for(int i=1 ; i<=M ; i++) {
    		num[i] = Integer.parseInt(st.nextToken());
    	}
    	
    	//누적합변수
    	int sum = 0;
    	for(int i=1 ; i<=M ; i++) {
    		sum += num[i]*Math.pow(A, M-i);
    	}
    	
    	//스택 선언
    	Stack<Integer> stack = new Stack<>();
    	
    	//sum이 0이 될 때까지
    	while(sum != 0) {
    		//B진법으로 바꾸기 위해 스택에 넣어주기
    		stack.push(sum % B);

    		//누적합 갱신
    		sum /= B;
    	}
    	
    	//스택이 빌 때 까지
    	while(!stack.isEmpty()) {
    		//스택에 하나만 남아있는 경우
    		if(stack.size() == 1) {
    			//헤드값 출력 후 개행
    			System.out.println(stack.peek());
    		}else {//아닌경우 공백 추가
    			System.out.print(stack.peek() + " ");
    		}
    		
    		stack.pop();
    	}
    }
}	
