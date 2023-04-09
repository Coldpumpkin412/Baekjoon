import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        String[] answer = new String[players.length];
		
		//key : 등수, value : 이름을 갖는 트리맵 생성(자동으로 오름차순)
		Map<Integer, String> rank = new TreeMap<>();
		//key : 이름, value : 등수를 갖는 해시맵 생성
		Map<String, Integer> rank2 = new HashMap<>();
		
		//맵 초기화
		for(int i=0  ; i<players.length ; i++) {
			rank.put(i+1, players[i]);
			rank2.put(players[i], i+1);
		}
		
		for(int i=0 ; i<callings.length ; i++) {
			//불린 이름
			String OverTake = callings[i];
			
			//불린 이름의 등 수(key값)
			int index = rank2.get(OverTake);
			
			//추월당한선수
			String behind = rank.get(index-1);
			
			//맵 업데이트
			rank2.put(OverTake, index-1);
			rank2.put(behind, index);
			rank.put(index-1, OverTake);
			rank.put(index, behind);
			
		}
		
		for(int i=0 ; i<rank.size() ; i++) {
			answer[i] = rank.get(i+1);
			
		}
		return answer;
    }
}