import java.util.*;

class Solution {
    //정답 출력에 사용할 리스트 선언(명령어+공백+유저아이디)
	List<String> answerList = new ArrayList<>();
	
	//유저아이디에 따른 닉네임 확인에 사용할 해시맵 선언
	Map<String, String> map = new HashMap<>(); 
    
    public String[] solution(String[] record) {
        
		//record배열을 한 줄 씩 확인
		for(int i=0 ; i<record.length ; i++) {
			//공백으로 분할
			String[] str = record[i].split(" ");
			
			//첫 단어가 Enter인 경우 answerList에 추가 및 해시맵 업데이트
			if(str[0].equals("Enter")) {
				answerList.add("Enter "+str[1]);
				map.put(str[1], str[2]);
			}
			//첫 단어가 Leave인 경우 answerList에 추가
			else if(str[0].equals("Leave")) {
				answerList.add("Leave "+str[1]);
			}
			//첫 단어가 Change인 경우 해시맵 업데이트
			else if(str[0].equals("Change")) {
				map.put(str[1], str[2]);
			}
		}
		//Enter와 Leave에 관한 것만 출력하므로 정답리스트의 사이즈와 같다
		String[] answer = new String[answerList.size()];
		
		//정답리스트를 처음부터 확인 후 공백으로 분할
		for(int i=0 ; i<answerList.size() ; i++) {
			String[] str = answerList.get(i).split(" ");
			
			//첫 단어가 Enter인 경우 두 번째 단어를 키로 갖는 "(value)+님이 들어왔습니다"
			if(str[0].equals("Enter")) {
				answer[i] = map.get(str[1])+"님이 들어왔습니다.";
			}
			//첫 단어가 Leave인 경우 두 번째 단어를 키로 갖는 "(value)+님이 나갔습니다."
			else if(str[0].equals("Leave")) {
				answer[i] = map.get(str[1])+"님이 나갔습니다.";
			}
		}
		
		return answer;
    }
}