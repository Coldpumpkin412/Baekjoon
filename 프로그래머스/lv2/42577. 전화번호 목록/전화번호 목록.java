import java.util.HashMap;

class Solution {
	public boolean solution(String[] phone_book) {
		//HashMap 생성
		HashMap<String, Integer> map = new HashMap<>();
		for(int i=0 ; i<phone_book.length ; i++) {
			map.put(phone_book[i], 1);
		}
		
		//모든 전화번호의 접두어가 HashMap에 있는지 확인
		for(int i=0 ; i<phone_book.length ; i++) {
			for(int j=1 ; j<phone_book[i].length() ; j++) {
				//map안에 키가 존재하는가? 이 때, 키로 전달할 값: phone_book[i]값의 substring
				/*
				 * 예를들어 6789라면 6, 67, 678이 map에 존재하는지 확인하는 것
				 */
				if(map.containsKey(phone_book[i].substring(0,j))) {
					return false;
				}
			}
		}
		//여기까지 왔다면 접두어는 없다
		return true;
	}
}