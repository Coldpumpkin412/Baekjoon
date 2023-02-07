class Solution {
    public String solution(String s, String skip, int index) {
        String answer="";
		int count = index;
		
		//s문자열을 한 글자 씩 확인
		for(int i=0 ; i<s.length() ; i++) {
			int ch = s.charAt(i);
			
			//아스키 코드를 활용하여 +1씩 index번 해주기
			for(int j=0 ; j<count ; j++) {
				ch++;
				//z이후에는 a로 돌아가기
				if(ch>122) ch -= 26;
				
				//skip에 있는 알파벳을 만나면 index+1
				if(skip.contains(String.valueOf((char)ch))) count++;
				
			}
			//answer배열에 저장
			answer += (char)ch;
			
			count = index; //도는 횟수 초기화
		}
		
		return answer;
    }
}