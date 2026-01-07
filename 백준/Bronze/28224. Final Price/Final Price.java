import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
        
		int answer = 0;
		
		for(int i=0 ; i<N ; i++) {
			int price = sc.nextInt();
			
            answer += price;
		}
		
		System.out.println(answer);
		sc.close();
	}
}