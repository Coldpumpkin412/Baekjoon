import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = Integer.parseInt(sc.nextLine());
        
		for(int i=0 ; i<N ; i++) {
			String str = sc.nextLine();

			System.out.println((str.charAt(0) + "").toUpperCase() + str.substring(1, str.length()));
		}
	}
}