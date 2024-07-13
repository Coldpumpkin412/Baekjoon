import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
        //2진수 입력
		String str = sc.next();
        
		String answer = "";	
        
		while(str.length()%3 != 0) {
			str = "0" + str;
		}
		
		for(int i=0 ; i<str.length()-1 ; i+=3) {
			int a1 = str.charAt(i) - '0';
			int a2 = str.charAt(i+1) - '0';
			int a3 = str.charAt(i+2) - '0';
            
			answer += Integer.toString((a1*4) + (a2*2) + (a3*1));
		}
        
		System.out.println(answer);		
	}
}