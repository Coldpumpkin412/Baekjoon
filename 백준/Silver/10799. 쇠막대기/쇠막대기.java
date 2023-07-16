import java.util.*;

public class Main {
	public static void main(String[] args) {
        /*
         * 스택 활용하여 풀기
         */
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		int answer = 0;
        
        //스택 선언
		Stack<Integer> stack = new Stack<Integer>();
		
		for(int i=0 ; i<str.length() ; i++) {
			if(str.charAt(i) == '(')
				stack.push(i);
			else {
                //서로 인접한 경우
				if(stack.pop() == i-1) 
					answer += stack.size();
				else
					answer += 1;
			}
		}
		
		System.out.println(answer);
	}
}