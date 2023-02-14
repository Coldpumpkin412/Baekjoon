import java.util.*;

class Solution {
    public String solution(int n, int t, int m, int p) {
        String answer="";
		
		String str = "";
		//0부터 각 숫자를 n진법 변환 후 문자열에 붙인다(참가인원 * 말해야하는 개수)만큼
		for(int i=0 ; i<t*m ; i++) str += Integer.toString(i, n).toUpperCase();
		
		int index=0;
		while(answer.length() != t) {//answer의 길이가 t와 같아질 때 빠져나온다
			
			//문자열의 자리를 참가인원으로 나눈 나머지+1이 p와 동일한 경우 answer에 저장
			if((index%m) + 1 == p) {
				answer += str.charAt(index);
			}
			
			index++;
		}
		
		return answer;
    }
}