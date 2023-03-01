import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
		
		Map<Character, Integer> map = new HashMap<>();
		
		//keymap 문자열의 값을 하나씩 받기
		for(int i=0 ; i<keymap.length ; i++) {
			for(int j=0 ; j<keymap[i].length() ; j++) {
				char ch = keymap[i].charAt(j);
				//해시맵에 추가(key : 알파벳, value : 인덱스) **이미 key가 존재하는 경우 인덱스가 더 작은 값으로 업데이트
				if(map.containsKey(ch)) {
					map.put(ch, Math.min(j+1, map.get(ch)));
				}else {
					map.put(ch, j+1);
				}
			}
		}
		
		//targets의 문자열을 하나씩 key로 받아서 해당 value 값 더해주기 (존재하지않다면 -1)
		for(int i=0 ; i<targets.length ; i++) {
			for(int j=0 ; j<targets[i].length() ; j++){
				if(map.containsKey(targets[i].charAt(j))) {
					answer[i] += map.get(targets[i].charAt(j));
				}else {
					answer[i] = -1;
					break;
				}
			}
			
		}
		return answer;
    }
}