import java.util.*;

public class Main {
	
	static int max = Integer.MIN_VALUE;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(); //전체 날짜의 수
		int[] tem = new int[N]; //날짜별 온도 저장 배열
		int K = sc.nextInt(); //합을 구하기 위한 연속적인 날짜의 수
		
		//온도입력
		for(int i=0 ; i<N ; i++) tem[i] = sc.nextInt();
		
		for(int i=0 ; i<N-K+1 ; i++) {
			int sum=0; //온도합
			
			for(int j=i ; j<i+K ; j++) sum += tem[j];
			max = Math.max(max, sum);
		}
		
		System.out.println(max);
		
		sc.close();
	}
}
