import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(true) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			
			
			if(a==0 && b==0 && c==0) break;
			
			if((a*a == b*b+c*c) || (b*b == a*a+c*c) || (c*c == a*a+b*b)) System.out.println("right");
			else System.out.println("wrong");
		}

	}
}