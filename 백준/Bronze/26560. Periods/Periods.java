import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
        sc.nextLine();
        
		for(int i=0 ; i<N ; i++) {
			String a = sc.nextLine();
			
			if(a.charAt(a.length()-1) == '.') {
				System.out.println(a);
			}else {
				System.out.println(a + ".");
			}
		}
	}
}