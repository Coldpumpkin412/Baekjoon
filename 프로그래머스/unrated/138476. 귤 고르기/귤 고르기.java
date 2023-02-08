import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
		
		//해시맵 생성(key : tangerine 값, value : 값 별 빈도)
		Map<Integer, Integer> map = new HashMap<>();
		
		//tangerine배열 값들의 등장 횟수 value값들로 입력
		for(int i : tangerine) {
			map.put(i, map.getOrDefault(i, 0) + 1);
		}
		//value를 기준으로 오름차순 정렬(리스트 활용)
		List<Integer> valueList = new ArrayList<>(map.values());
		valueList.sort(Integer::compareTo);
		
		//value값들의 합(리스트 값들의 합) 구하기
		int sum=0;
		for(int i : valueList) sum += i;
		
		
		//k에서 value값들을 차례로 제거 
		for(int i=0 ; i<valueList.size() ; i++) {
			sum -= valueList.get(i);
			
			//남은 value값들의 합이 k보다 작거나 같다면 그 때 남은 key의 개수(리스트의 크기)가 최소값
			if(sum < k) {
				answer = valueList.size()-i;
				break;
			} else if(sum == k) {
				answer = valueList.size()-(i+1);
				break;
			}
			
		}
		return answer;
    }
}