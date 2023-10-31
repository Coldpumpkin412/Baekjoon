import java.util.*;
import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		//피연산자 개수 입력 및 배열 선언
		int N = Integer.parseInt(br.readLine());
		double[] num = new double[N];
		
		//후위표기식 입력
		String str = br.readLine();
		
		//알파벳 별 숫자 입력
		for(int i=0 ; i<N ; i++) {
			num[i] = Double.parseDouble(br.readLine());
		}
		
		//스택 선언
		Stack<Double> stack = new Stack<>();
		
		//후위표기식 첫글자부터 확인
		for(int i=0 ; i<str.length() ; i++) {
			char ch = str.charAt(i);
			
			//알파벳인경우
			if('A'<=ch && ch<='Z') {
				//아스키코드 활용하여 num 배열값 스택에 넣어주기
				stack.push(num[ch-65]);
			}else {
				//곱셈인 경우
				if(ch == '*') {
					//제일 최신 숫자 2개 뽑은 후 곱해준 값을 다시 스택에 넣어주기
					double num1 = stack.pop();
					double num2 = stack.pop();
					
					stack.push(num1 * num2);
				}else if(ch == '+') { //덧셈인 경우
					//제일 최신 숫자 2개 뽑은 후 더해준 값을 다시 스택에 넣어주기
					double num1 = stack.pop();
					double num2 = stack.pop();
					
					stack.push(num1 + num2);
				}else if(ch == '/') { //나눗셈인 경우
					//제일 최신 숫자 2개 뽑은 후 나눠준 값을 다시 스택에 넣어주기
					double num1 = stack.pop();
					double num2 = stack.pop();
					
					stack.push(num2/num1);
				}else if(ch == '-') { //뺄셈인 경우
					//제일 최신 숫자 2개 뽑은 후 빼준 값을 다시 스택에 넣어주기
					double num1 = stack.pop();
					double num2 = stack.pop();
					
					stack.push(num2 - num1);
				}
				
			}
		}
		
		System.out.printf("%.2f", stack.pop());
    }
}	
