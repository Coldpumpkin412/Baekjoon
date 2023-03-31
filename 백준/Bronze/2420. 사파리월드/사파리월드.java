import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
        //결과값이 int형을 벗어날 수 있으므로 long 형 사용
		long N = sc.nextLong();
		long M = sc.nextLong();
		
		System.out.println((long)Math.max(N, M)-Math.min(N, M));
	}
}

	
