import java.util.*;

class Solution
{
    public int solution(String s)
    {
        //주어진 문자열을 문자배열로 변경
		char[] ch = s.toCharArray();
		
		//가장 긴 것부터 검사
		for(int i=s.length() ; i>1 ; i--) {
			//시작점
			for(int start=0 ; start+i<=s.length() ; start++) {
				boolean check = true;
				
				//문자열의 반만큼 같은지 확인
				for(int j=0 ; j<i/2 ; j++) {
					if(ch[start+j] != ch[start+i-j-1]) {
						check = false;
						break;
					}
				}
				
				//check가 true라면 그떄의 문자열길이가 정답
				if(check) {
					return i;
				}
			}
		}
		
		return 1;
    }
}