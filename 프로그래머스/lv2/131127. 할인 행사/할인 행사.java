import java.util.*;

class Solution {
    
    //해시맵 생성
	Map<String, Integer> map = new HashMap<>();
    
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
		//(key : want배열의 값, value : number배열의 값)
		for(int i=0 ; i<want.length ; i++) {
			map.put(want[i], number[i]);
		}
		
		//discount배열을 10개씩 돌며 메뉴 만날때마다 value -1, 디폴트 값:0
		for(int i=0 ; i<discount.length ; i++) {
			boolean check = true;
			
			for(int j=i ; j<i+10 && j<discount.length ; j++) {
				map.put(discount[j], map.getOrDefault(discount[j], 0)-1);
			}
			//해시맵의 모든 value가 0보다 작다면 answer++
			for(String key : map.keySet()) {
				if(map.get(key)>0) check = false;
			}
			
			if(check) answer++;
			
			//해시맵 초기화
			for(int k=0 ; k<want.length ; k++) {
				map.put(want[k], number[k]);
			}
		}
		
		
		return answer;
		
		
    }
}