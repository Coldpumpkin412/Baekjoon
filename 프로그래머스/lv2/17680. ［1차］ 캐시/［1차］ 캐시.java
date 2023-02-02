import java.util.*;

class Solution {
	/*
	 * ArrayList 활용
	 * 리스트의 사이즈가 캐시사이즈에 도달했을 때,
	 * 캐시 미스인 경우 리스트 맨 앞 값을 remove 후 add
	 * 캐시 힛인 경우 리스트 맨 앞 값을 맨 뒤로 보내기
	 *
	*/
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
		ArrayList<String> list = new ArrayList<>(); //LRU알고리즘에 사용할 리스트
		
		//캐시사이즈가 0인경우
		if(cacheSize==0) return cities.length * 5;
		
		//캐시사이즈가 0보다 큰 경우
		for(int i=0 ; i<cities.length ; i++) {
			//대소문자 구분을 없애기 위해 모두 대문자로 변환
			String city = cities[i].toUpperCase(); 
			
			//리스트에 해당 도시가 존재한다면 제거 후 true 반환(캐시 힛)
			if(list.remove(city)) {
				list.add(city); //리스트의 끝부분으로 다시 추가
				answer += 1;
			}
			//리스트에 해당 도시가 존재하지 않다면(캐시 미스)
			else {
				if(list.size() >= cacheSize) {
					list.remove(0); //제일 앞에있는(오래된) 도시 제거
				}
				list.add(city); //리스트 끝부분에 추가
				answer += 5;
			}
		}
		
		return answer;
    }
}