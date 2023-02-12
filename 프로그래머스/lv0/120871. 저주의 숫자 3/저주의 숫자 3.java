class Solution {
    public int solution(int n) {
        int answer = 0;
        int i=0;
        
        while(i<n){
            i++;
            answer++;
            
            //3의배수이거나, 일의자리 혹은 십의자리가 3인경우 값 증가
            //100을 넘어갔을때 나눴을때 13인경우도 값 증가
            while((answer%3==0) || (answer%10==3) || 
                  (answer/10==3) || (answer/10==13)){
                answer++;
            }
        }
        return answer;
    }
}