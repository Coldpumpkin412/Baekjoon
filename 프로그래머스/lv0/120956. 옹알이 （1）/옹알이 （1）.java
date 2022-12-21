import java.util.*;

class Solution {
    public int solution(String[] babbling) {
        int answer=0;
        //문자열리스트 새로 선언
		List<String[]> bab_list = new ArrayList<>();
		
		for(int i=0 ; i<babbling.length ; i++) {
			//조카의 발음별로 분할
			String[] str = babbling[i].split("aya|ye|woo|ma");
			bab_list.add(str);
		}
		//조카의 발음별로 이루어졌을경우 크기가 0이됨
		for(int i=0 ; i<bab_list.size() ; i++) {
			if(bab_list.get(i).length==0) answer++;
		}

        return answer;
    }
}