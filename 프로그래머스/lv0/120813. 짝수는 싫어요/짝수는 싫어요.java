class Solution {
    public int[] solution(int n) {
        int[] answer = new int[(n+1)/2];
        int cnt = 0;
        int i=1;
        
        while(cnt<(n+1)/2){
            if(i%2==1){
                answer[cnt] = i;
                cnt++;
                i++;
            }
            else i++;
        }
        
        return answer;
    }
}