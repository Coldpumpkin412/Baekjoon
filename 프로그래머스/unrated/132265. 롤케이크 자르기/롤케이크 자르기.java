import java.util.*;

class Solution {
    public int solution(int[] topping) {
        int answer = 0;
		
		//형과 동생의 해시맵 생성(key : 토핑종류, value : 빈도)
		Map<Integer, Integer> map1 = new HashMap<>();
		Map<Integer, Integer> map2 = new HashMap<>();
		
		//형의 해시에 모든 토핑을 넣어준다
		for(int i=0 ; i<topping.length ; i++) {
			map1.put(topping[i], map1.getOrDefault(topping[i], 0) + 1);
		}
		
		//토핑 배열 끝에서부터 0까지
		for(int i=topping.length-1 ; i>=0 ; i--) {
			//형의 토핑에서 하나씩 빼주기
			map1.put(topping[i], map1.getOrDefault(topping[i], 0) - 1);
			
			//형의 토핑중에 빈도가 0이 되는것이 있으면 해시맵에서 제거
			if(map1.get(topping[i]) == 0) {
				map1.remove(topping[i]);
			}
			
			//동생의 해시맵에는 추가해주기
			map2.put(topping[i], map2.getOrDefault(topping[i], 0) + 1);
			
			//두 개의 해시 사이즈가 동일하면 answer 증가
			if(map1.size() == map2.size()) answer++;
		}
		
		
		
		return answer;
    }
}