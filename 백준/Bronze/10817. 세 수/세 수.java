import java.util.*;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
        //정수 3개 입력
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        
        int sum = A+B+C;
        int max = Math.max(Math.max(A,B),C);
        int min = Math.min(Math.min(A,B),C);
        
        System.out.println(sum - max - min);
	}
}