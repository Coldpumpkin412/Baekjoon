class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        long split_str = 0; //분할한 문자열을 정수형으로 저장할 변수
        
        //p의 길이가 18까지 이므로 int형이 아닌 long형으로 변환 및 저장
        for(int i=0 ; i<t.length()-p.length()+1 ; i++){
            split_str = Long.parseLong(t.substring(i,i+p.length()));
            if(split_str <= Long.parseLong(p)) answer++;
        }
        
        return answer;
    }
}