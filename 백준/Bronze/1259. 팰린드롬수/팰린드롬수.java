import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			String str = sc.next();
			boolean check = true;
			
			//0을 입력받으면 종료
			if(str.equals("0")) break;
			
			for(int i=0 ; i<str.length()/2 ; i++) {
				if(str.charAt(i) != str.charAt(str.length()-i-1)) check=false;
			}
			
			if(check) System.out.println("yes");
			else System.out.println("no");
			
		}
	}
}