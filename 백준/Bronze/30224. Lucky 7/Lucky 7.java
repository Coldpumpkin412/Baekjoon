import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String N = sc.next();
		
		int i;
        
		for(i=0 ; i<N.length() ; i++) {
			if(N.charAt(i) == '7') {
				break;
			}
		}
		
		int num = Integer.parseInt(N);
        
		if(i==N.length() && num%7!=0) {
			System.out.println("0");
		}else if(i==N.length() && num%7==0) {
			System.out.println("1");
		}else if(i!=N.length() && num%7!=0) {
			System.out.println("2");
		}else if(i!=N.length() && num%7==0) {
			System.out.println("3");
		}
        
	}
}