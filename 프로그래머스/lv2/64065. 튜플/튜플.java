import java.util.*;
import java.util.HashMap;

class Solution {
    public int[] solution(String s) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
		//주어진 문자열에서 숫자부분을 제외하고 모두 공백으로 변환
		String[] arr = s.split("[^0-9]");
		
		//문자열 배열마다 비교하여 숫자를 만나면 해시에 넣는다.(Key:숫자(문자열), value:횟수)
		for(int i=0 ; i<arr.length ; i++) {
			if(!arr[i].isEmpty()) {
				//map에 값이 없으면 0을 넣고, 있다면 +1 (나온 횟수)
				map.put(Integer.parseInt(arr[i]), map.getOrDefault(Integer.parseInt(arr[i]), 0)+1);
			}
		}
		//횟수가 높은 순서대로 내림차순 정렬
		List<Integer> keySet = new ArrayList<>(map.keySet());
		Collections.sort(keySet, (value1, value2) -> (map.get(value2).compareTo(map.get(value1))));

		//key값을 배열에 넣은 후 출력
		int[] answer= new int[map.size()];
		int i=0;
		
		for(int key : keySet) {
			answer[i] = key;
			i++;
		}
		
		return answer;
    }
}