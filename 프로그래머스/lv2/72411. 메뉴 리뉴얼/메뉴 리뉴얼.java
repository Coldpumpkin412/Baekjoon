import java.util.*;

class Solution {
    
    List<String> answerList = new ArrayList<>();
	Map<String, Integer> map = new HashMap<>();
	
	//메뉴 조합 함수(order : 현재까지 조합된 코스, others : 아직 사용되지 않은 메뉴, count : 몇 개를 더 조합해야하는가)
	public void combination(String order, String others, int count) {
		//탈출 조건
		if(count == 0) {
			//이미 있는 조합이라면 +1을, 처음 등장한 조합이라면 디폴트값으로 0을 넣는다 (빈도체크)
			map.put(order, map.getOrDefault(order, 0)+1);
            return;
		}
		
		//수행 동작 : 0부터 length까지 조합
		for(int i=0 ; i<others.length() ; i++) {
			combination(order + others.charAt(i), others.substring(i+1), count-1); //재귀적 호출
		}
	}
    
    
    public String[] solution(String[] orders, int[] course) {
        // 1. 각 order을 정렬한다
		for(int i=0 ; i<orders.length ; i++) {
			char[] arr = orders[i].toCharArray(); //주문내역을 char배열로 변환
			Arrays.sort(arr); //정렬
			orders[i] = String.valueOf(arr); //정렬된 값을 String값으로 다시 담아주기
		}
		
		// 2. 각 order를 기준으로 course 값 만큼의 조합 만들기
		for(int courseLength : course) {
			for(String order : orders) {
				combination("", order, courseLength);
			}
			
			// 3. 가장 많은 빈도를 갖는 조합을 answer에 저장한다
			if(!map.isEmpty()) {//combination함수를 통해 조합들이 잘 만들어졌다면
				
				//value 중 최대값 찾기(value값들을 가지고 리스트 형태로 만든 후 찾기)
				List<Integer> maxList = new ArrayList<> (map.values());
				
				//최대값 저장
				int max = Collections.max(maxList);
				
				if(max > 1) {
					for(String key : map.keySet()) {//keySet을 통해 key값들 가져오기
						if(map.get(key) == max) { //key값을 통해 확인한 value가 최대값과 같다면
							answerList.add(key);  //answerList에 저장
						}
					}
				}
				
				map.clear(); //해시맵 초기화 하여 다음 courseLength에 따른 값 저장할 준비
			}
		}
		
		Collections.sort(answerList);
		String[] answer = new String[answerList.size()];
        
		for(int i=0 ; i<answerList.size() ; i++) {
			answer[i] = answerList.get(i);
		}
		
		return answer;
    }
}