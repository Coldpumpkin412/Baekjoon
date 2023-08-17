import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
        //N입력
		int N = sc.nextInt();
        
        //스택 선언
		Stack<Character> stack = new Stack<Character>();
		int goodWords = 0;

		for(int i=0 ; i<N ; i++) {
			//문자열 입력
            String str = sc.next();
            
			for(int j=0 ; j<str.length() ; j++) {
                //현재문자와 스택의 헤드가 같다면 제거
				if(!stack.isEmpty() && str.charAt(j)==stack.peek()) {
                    stack.pop();	
                } else{
                    stack.push(str.charAt(j));
                } 
					
			}
			//전부 짝이 맞을경우 -> 좋은단어
			if(stack.size()==0){
                goodWords++;
            }
				
            //초기화
			stack.clear();	
		}

		System.out.println(goodWords);
	}

}
