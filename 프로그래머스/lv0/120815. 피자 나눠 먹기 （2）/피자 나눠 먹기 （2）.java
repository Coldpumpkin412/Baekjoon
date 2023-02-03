class Solution {
    public int solution(int n) {
        int answer = 0;
        int i=1;
        
        while(true){
            if((i*n)%6 == 0){
                answer = (i*n) / 6;
                break;
            } else i++;
        }
        
        return answer;
    }
}