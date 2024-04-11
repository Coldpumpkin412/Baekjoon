import java.util.*;
import java.io.*;


public class Main {
	
	//예산 누적합 함수
	static int total(int[] arr, int mid) {
		int sum = 0;
		
		for(int num : arr) {
			//중간값과 요청 예산값 중 작은 것을 더해주기
			sum += Math.min(mid, num);
		}
		
		//누적합 반환
		return sum;
	}
	
    public static void main(String[] args) throws IOException {
    	/*
    	 * 이분탐색 활용
    	 */
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st;
    	
    	//지방의 수 N 입력
    	int N = Integer.parseInt(br.readLine());
    	
    	//이분탐색에 활용할 최댓값 및 최솟값 선언
    	int high = 0;
    	int low = 1;
    	
    	int sum = 0;
    	
    	//각 지방의 예산 요청 배열 선언 및 값 입력
    	int[] budget = new int[N];
    	
    	st = new StringTokenizer(br.readLine());
    	for(int i=0 ; i<N ; i++) {
    		budget[i] = Integer.parseInt(st.nextToken());
    		
    		sum += budget[i];
    		
    		//최댓값 최신화
    		high = Math.max(high, budget[i]);
    	}
    	
    	//총 예산 입력
    	int bud_sum = Integer.parseInt(br.readLine());
    	
    	//총 예산이 요청예산의 합 이상인 경우 최댓값 출력 후 종료
    	if(sum <= bud_sum) {
    		System.out.println(high);
    		return;
    	}
    	
    	//이분탐색 실시
    	while(low <= high) {
    		//중간값(상한액)
    		int mid = (low+high) / 2;
    		
    		//중간값을 기준으로 예산에 대한 누적값이 총예산보다 크다면
    		if(total(budget, mid) > bud_sum) {
    			//중간값을 낮게 설정
    			high = mid - 1;
    		}else {
    			//중간값을 높게 설정
    			low = mid + 1;
    		}
    	}
    	
    	System.out.println(high);
    }
}	
