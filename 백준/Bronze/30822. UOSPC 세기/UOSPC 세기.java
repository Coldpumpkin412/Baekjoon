import java.util.*;
import java.math.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		String str = sc.next();
		
		int U = 0;
		int O = 0;
		int S = 0;
		int P = 0;
		int C = 0;
		
		for(int i=0 ; i<str.length() ; i++) {
			if(str.charAt(i) == 'u') {
				U++;
			}
			if(str.charAt(i) == 'o') {
				O++;
			}
			if(str.charAt(i) == 's') {
				S++;
			}
			if(str.charAt(i) == 'p') {
				P++;
			}
			if(str.charAt(i) == 'c') {
				C++;
			}
		}
		
		int min = 0;
        
        min = Math.min(U, O);
		min = Math.min(S, min);
		min = Math.min(P, min);
		min = Math.min(C, min);
		
		System.out.println(min);
	}
}