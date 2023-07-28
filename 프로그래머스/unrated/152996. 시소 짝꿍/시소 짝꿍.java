import java.util.*;

class Solution {
    public long solution(int[] weights) {
       /*
		 * HashMap 활용하기.
		 * 토크값들을 활용하여 2/3, 1/2, 3/4의 값들을 확인 후 비교
		 */
		long answer = 0;
		
		//해시맵 선언(key : 무게*거리에따른 토크값, value : 빈도)
		Map<Double, Integer> map = new HashMap<>();
		
		//배열 오름차순정렬
		Arrays.sort(weights);
		
		for(int i=0 ; i<weights.length ; i++) {
			//자기자신
			double first = weights[i]*1.0;
			//1m,2m 거리에 따른 비교값
			double second = (weights[i]*1.0)/2.0;
			//2m,3m 거리에 따른 비교값
			double third = (weights[i]*2.0)/3.0;
			//3m,4m 거리에 따른 비교값
			double fourth = (weights[i]*3.0)/4.0;
			
            //각 키를 포함하고있을 때 정답 최신화
			if(map.containsKey(first)) {
				answer+=map.get(first);
			}
            if(map.containsKey(second)) {
    			answer+=map.get(second);
    		}
            if(map.containsKey(third)) {
    			answer+=map.get(third);
    		}
            if(map.containsKey(fourth)) {
    			answer+=map.get(fourth);
    		}
			
			//빈도 수 저장
			map.put(weights[i]*1.0, map.getOrDefault(weights[i]*1.0, 0)+1);
		}
		
		return answer;
    }
}