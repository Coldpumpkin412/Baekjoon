import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
		
		//이름에 대한 추억점수를 기억할 해시맵 선언(key : 이름, value : 추억점수)
		Map<String, Integer> map = new HashMap<>();
		
		//이름 및 추억점수 업데이트
		for(int i=0 ; i<name.length ; i++) {
			map.put(name[i], yearning[i]);
		}
		
		//추억점수를 answer 배열에 순서대로 저장
		for(int i=0 ; i<answer.length ; i++) {
			
			//photo의 값이 해시맵에 있는경우 추억점수 더해주기
			for(int j=0 ; j<photo[i].length ; j++) {
				if(map.containsKey(photo[i][j])) {
					answer[i] += map.get(photo[i][j]);
				}
			}
		}
		
		return answer;
    }
}