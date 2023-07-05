import java.util.*;

class Solution {
    public int solution(int[] A, int[] B) {
        /*
		 * A,B 모두 오름차순 정렬 후
		 * A보다 큰 B의 숫자중 가장 작은 수를 만났을 때 answer증가 및 B의 index도 늘리기
		 */
        
		int answer = 0;
		
		//A,B 모두 오름차순 정렬
		Arrays.sort(A);
		Arrays.sort(B);
		
		//B의 index 0으로 초기화
		int index = 0;
		
		for(int i=0 ; i<A.length ; i++) {
			for(int j=index ; j<B.length ; j++) {
                //A보다 큰 원소를 만나면 answer 증가 후 인덱스를 B의 다음 인덱스로 초기화
				if(A[i]<B[j]) {
					answer++;
					index = j+1;
					break;
				}
			}
		}
		
		return answer;
    }
}