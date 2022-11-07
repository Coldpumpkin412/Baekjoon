import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); //사람의 수 N 입력
		int[] time = new int[N]; //각각 돈 인출에 걸리는 시간
		
		int count=0; //돈 인출에 걸리는 총 시간
		
		for(int i=0 ; i<N ; i++) {
			time[i] = sc.nextInt();
		}
		
		Arrays.sort(time); //돈 인출의 총 시간을 최소한으로 하기 위해선 오름차순으로 정렬
		
		for(int i=0 ; i<N ; i++) {
			count += time[i]*(N-i);
		}
		
		System.out.println(count);	
	}

}
