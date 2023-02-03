class Solution {
    public int solution(int num, int k) {
        String number = Integer.toString(num); //정수를 문자열로 변경
        int answer = 0;
        
        for(int i=0 ; i<number.length() ; i++){
            if(number.charAt(i)-'0' == k){
                answer = i+1;
                break;
            } 
            answer = -1;
        }
        return answer;
    }
}