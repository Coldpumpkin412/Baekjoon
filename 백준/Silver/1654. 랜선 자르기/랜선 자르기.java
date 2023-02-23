
import java.util.*;

/*
 * int형 범위를 벗어나는 수가 존재하기 때문에 최소값, 최대값, 그에따른 중간값, 배열값
 * 등 대부분의 변수는 long타입으로 선언해주어야한다.
 */
public class Main {
	
	//이진탐색 함수
	private static long BinarySearch(long[] arr, int N, long max) {
		//중간값 및 최소값 선언
		long mid = 0;
		long min = 1;
		
		while(min <= max) {
			mid = (min + max) / 2;
			
			//잘라진 랜선들의 개수
			long sum = 0;
			for(long num : arr) sum += num/mid;
			
			//잘라진 랜선 수가 N보다 많은경우
			if(sum < N) {
				max = mid - 1;
			}
			else { //잘라진 랜선 수가 N보다 적은경우
				min = mid + 1;
			}
		}
		
		return (min + max) / 2;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long answer = 0;
		long max = 0; //이진탐색에 이용할 변수
		
		//가지고 있는 랜선의 개수 K 및 필요한 랜선의 개수 N 입력
		int K = sc.nextInt();
		int N = sc.nextInt();
		
		//K개의 랜선 각각의 길이 입력
		long[] arr = new long[K];
		for(int i=0 ; i<K ; i++) {
			arr[i] = sc.nextInt();
			max = Math.max(max, arr[i]); //최대값 최신화
		}
		
		//이진탐색 실행
		answer = BinarySearch(arr, N, max);
		
		System.out.println(answer);
		
	}
}

	
