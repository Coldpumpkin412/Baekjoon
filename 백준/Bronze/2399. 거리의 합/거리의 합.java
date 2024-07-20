import java.util.*;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
        //N 입력 및 배열 X 선언
		int N = sc.nextInt();
		int[] X = new int[N];
        
		long sum = 0;	
		
        //배열값 입력
		for(int i=0 ; i<N ; i++) {
            X[i] = sc.nextInt();
        }
			
		for(int i=0 ; i<X.length ; i++) {
            for(int j=0 ; j<X.length ; j++) {
                sum += Math.abs(X[i]-X[j]);
            }
        }
			
		System.out.println(sum);
	}
}