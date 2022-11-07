import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(); //각각의 배열에 N개의 수 입력
		int[] A = new int[N];
		Integer[] B = new Integer[N]; //내림차순을 위해 변수를 이런식으로 선언
		int sum=0; //결과값
		
		for(int i=0 ; i<N ; i++) {
			A[i] = sc.nextInt(); //A배열의 값 입력
		}
		for(int i=0 ; i<N ; i++) {
			B[i] = sc.nextInt(); //B배열의 값 입력
		}
		//최소값을 구하기위해 가장 큰 수는 최소로 곱하고, 가장 작은수는 최대로 곱한다
		//즉 오름차순과 내림차순을 이용하여 각각 곱해준다 
		Arrays.sort(A);
		Arrays.sort(B, Collections.reverseOrder());
		
		for(int i=0 ; i<N ; i++) {
			sum += A[i]*B[i];
		}
		System.out.println(sum);
	}
}