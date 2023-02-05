class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        
        for(int start=i ; start<=j ; start++){
        String number = Integer.toString(start); //숫자를 문자열로 변경
        
            //문자열로 바뀐 정수를 한글자씩 쪼개서 비교
            for(int tmp=0 ; tmp<number.length() ; tmp++){
                if(number.charAt(tmp)-'0' == k) answer++;
            }
        }
        return answer;
    }
}