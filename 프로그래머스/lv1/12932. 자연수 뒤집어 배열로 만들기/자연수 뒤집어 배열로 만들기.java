class Solution {
    public int[] solution(long n) {
        String s = Long.toString(n); //주어진 자연수를 문자열로 변환
        int[] answer = new int[s.length()];
        
        for(int i=0 ; i<s.length() ; i++){
            //문자를 정수형으로 변환 후 배열에 저장
            answer[i] = s.charAt(s.length()-i-1)-'0';
        }
        return answer;
    }
}