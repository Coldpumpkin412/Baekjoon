import java.util.*;

class Solution {
	public String solution(String[] survey, int[] choices) {
		String answer = "";
        
		//mbti 해시맵 생성, (Key는 성격유형, Value는 점수)
		HashMap<Character, Integer> mbti = new HashMap<>();
        
        //각 성격유형을 key로 두었을때 해당 점수(value) 0으로 초기화
		mbti.put('R', 0);	mbti.put('T', 0);
		mbti.put('C', 0);	mbti.put('F', 0);
		mbti.put('J', 0);	mbti.put('M', 0);
		mbti.put('A', 0);	mbti.put('N', 0);
		
	
		for(int i=0 ; i<choices.length ; i++) {

			switch(choices[i]){
			case 1: mbti.put(survey[i].charAt(0), mbti.get(survey[i].charAt(0))+3); break;
			case 2: mbti.put(survey[i].charAt(0), mbti.get(survey[i].charAt(0))+2); break;
			case 3: mbti.put(survey[i].charAt(0), mbti.get(survey[i].charAt(0))+1); break;
			//4번의 경우 점수 변동 없으므로 제외
			case 5: mbti.put(survey[i].charAt(1), mbti.get(survey[i].charAt(1))+1); break;
			case 6: mbti.put(survey[i].charAt(1), mbti.get(survey[i].charAt(1))+2); break;
			case 7: mbti.put(survey[i].charAt(1), mbti.get(survey[i].charAt(1))+3); break;
			}
			
		}
		
		answer += (mbti.get('R') >= mbti.get('T')) ? 'R' : 'T';
		answer += (mbti.get('C') >= mbti.get('F')) ? 'C' : 'F';
		answer += (mbti.get('J') >= mbti.get('M')) ? 'J' : 'M';
		answer += (mbti.get('A') >= mbti.get('N')) ? 'A' : 'N';
		
		return answer;
    }
}