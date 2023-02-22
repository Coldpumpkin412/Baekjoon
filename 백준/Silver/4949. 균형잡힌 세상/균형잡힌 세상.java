import java.util.*;


public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Character> stack = new Stack<>();
		
		//온점이 들어올때까지 문자열 입력받기(온점 하나만 들어온다면 종료)
		while(true) {
			stack.clear();
			String str = sc.nextLine();
			
			if(str.equals(".")) break;
			
			for(int i=0 ; i<str.length() ; i++) {
				char ch = str.charAt(i);
				
				//열린괄호( '(', '[' )가 들어올 때마다 스택에 쌓아준다
				if(ch=='(' || ch=='[') stack.push(ch);
				else if(ch==')' || ch==']') {
					//빈 스택에 닫힌 괄호가 들어오는 경우 or 종류에 맞지않는 열린괄호와 닫힌괄호가 만나는 경우 바로 break
					if(stack.isEmpty() || (stack.peek()=='(' && ch==']') || (stack.peek()=='[' && ch==')')) {
						stack.push(ch);
						break;
					}
					//이외에는 종류에 맞는 닫힌괄호가 들어온경우 이므로 스택의 헤드값을 제거
					stack.pop();
				}
			}
			
            //스택이 비어있다면 yes, 아니라면 no 출력
			if(!stack.isEmpty()) System.out.println("no");
			else System.out.println("yes");
		}
		
		sc.close();
	}
}

	
