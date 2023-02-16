import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		String s = sc.nextLine();
		
		for(int i=0 ; i<T ; i++) {
			//확인할 괄호 문자열 입력
			String str=""; 
			str=sc.nextLine();
			
			boolean VFS = true; //VFS판단 변수
			
			//스택을 활용하여 해결
			Stack<Character> stack=new Stack<>();
			
			
			for(int j=0;j<str.length();j++) {
				if(str.charAt(j)=='(') {
					stack.push('(');
				} else if(str.charAt(j)==')') {
					if(!stack.empty()) //비지않았다면 
						stack.pop(); //스택의 헤드를 제거
					else { //비었는데 ')' 들어오면  (문자열의 첫 문자가 닫느괄호인 경우)
						VFS=false;
						break; //for문 탈출
					}
				}

			}
			if(!stack.empty() || VFS==false) System.out.println("NO");
			
			else System.out.println("YES");
			
		}
	}
			
}

	
