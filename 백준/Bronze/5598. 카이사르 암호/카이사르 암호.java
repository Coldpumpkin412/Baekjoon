import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
		String str = sc.next();
        
		char answer;
        
        //아스키코드 활용
		for(int i=0 ; i<str.length() ; i++) { 
			if(str.charAt(i) <= 'C'){
                answer = (char)(str.charAt(i) + 23);
            } else{
                answer = (char)(str.charAt(i) - 3);
            }
				
			System.out.print(answer);
		}
	}
}