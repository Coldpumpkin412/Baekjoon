class Solution {
    public int solution(int left, int right) {
        int answer = 0;

        for(int i=left ; i<=right ; i++){
            int divisor = 0; //약수의 개수
            int count = 1;
            while(count<=i){
                if(i%count==0) {
                    divisor++;
                    count++;
                }else count++;
            }
            
            if(divisor%2==0){
                answer += i;
            } else answer -= i;
        }
        return answer;
    }
}