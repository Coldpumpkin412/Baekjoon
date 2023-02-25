import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//테스트케이스 개수 입력
		int T = sc.nextInt();
		
		for(int i=0 ; i<T ; i++) {
			String str = sc.next();
			char first = str.charAt(0);
			char last = str.charAt(str.length()-1);
            
			System.out.print(first);
			System.out.println(last);
		}
		
	}
}

	
