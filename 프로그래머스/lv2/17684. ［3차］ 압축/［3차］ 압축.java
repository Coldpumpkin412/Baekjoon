import java.util.*;

class Solution {
    //정답을 저장할 리스트 및 사전 선언
	List<Integer> answerList = new ArrayList<>();
	Map<String, Integer> map = new HashMap<>();
	
	static int count = 0;
	static int index = 1;
		
    public int[] solution(String msg) {
        //사전 초기화(해시맵 사용, Key : 알파벳, Map : 색인번호)
		while(index<=26) {
			map.put(Character.toString((char)(64+index)), index);
			index++;
		}

		
		//주어진 문자열 한글자씩 확인
		while(count<msg.length()) {
			String str="";

			while(count<msg.length()) {
				//사전에 존재하지않는다면 빠져나오기
				if(!map.containsKey(str+msg.charAt(count))) break;
				//사전에 존재한다면 다음글자까지 확인
				else str += msg.charAt(count);
				
				count++;
			}
			
			//빠져나온 당시 문자의 색인 저장
			answerList.add(map.get(str));
			
			if(count<msg.length()) {
				//사전에 존재하지 않는 문자 추가 후 색인 증가
				map.put(str+msg.charAt(count), index++);
			}
			
			
		}
		
		int[] answer = new int[answerList.size()];
		for(int i=0 ; i<answerList.size() ; i++) {
			answer[i] = answerList.get(i);
		}
		
		return answer;
    }
}