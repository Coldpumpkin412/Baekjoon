import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		//숫자 임시 저장 스택 선언
		Stack<Integer> stack = new Stack<>();
		
		//숫자의 개수 입력
		int n = Integer.parseInt(br.readLine());
		
		int index = 0;
		
        //n이 0이 될 때 까지
		while(n --> 0) {
			int number = Integer.parseInt(br.readLine()); //숫자입력
			
            //입력한 숫자가 index보다 크다면
			if(number > index) {
                //number까지 스택에 넣은 후 +를 저장
				for(int i=index+1 ; i<=number ; i++) {
					stack.push(i);
					sb.append("+").append("\n");
				}
				//인덱스 초기화
				index = number;
			}else if(stack.peek() != number) {
                //스택의 헤드값이 number가 아니라면 NO출력 후 프로그램 종료
				System.out.println("NO");
				return;
			}
			//스택의 헤드값 출력 후 -저장
			stack.pop();
			sb.append("-").append("\n");
			
		}
		System.out.println(sb);
	}
}

	
