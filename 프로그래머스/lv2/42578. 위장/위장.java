import java.util.*;
import java.util.HashMap;

class Solution {
    /*
	 * 해시를 활용하여 종류별 경우의 수 찾기
	 * 한 가지 옷만 입어도 되기때문에 각 옷 종류에 입지않는경우(none)을 추가
	 * 마지막에 아무것도 입지않는경우(옷 모든 종류에 none이 선택되는)를 빼준다
	 * 
	 * 종류별 의상의 개수를 세서 조합을 구하면 쉬워진다
	 */
	public int solution(String[][] clothes) {
		// 1. 옷을 종류별로 구분(종류별로 가지고 있는 옷의 개수가 중요하기에 value는 Integer로 받는다
		HashMap<String, Integer> map = new HashMap<>();
		for(String[] clothe : clothes) {
			String type = clothe[1];
			
			//type의 값이 없었다면 0을 넣어준다(getOrDefault), 값이 있다면 +1을 해준다
			map.put(type, map.getOrDefault(type, 0)+1); 
		}
		
		// 2. 입지 않는 경우 추가하고 모든 조합의 수를 구하기
		Iterator<Integer> it = map.values().iterator();
		int answer = 1;
		
		while(it.hasNext()) { //이터레이터에 다음 요소가 있는가
			answer *= it.next().intValue()+1; //입지않은 경우까지 추가해서 곱해준다
		}
		// 3. 아무 종류의 옷도 입지 않는 경우 제외
		return answer-1;
	}
}