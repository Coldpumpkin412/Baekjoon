class Solution {
    public int solution(int n) {
        int answer = 0;
        int i=1;
        while(i<=n){
            int count=0; //약수의개수 저장할 변수
            for(int j=1; j<=i ; j++){
                if(i%j==0) count++;
            }
            if(count>=3) answer++; //약수의 개수가 3개 이상이면 합성수개수 +1
            
            i++;
        }
        return answer;
    }
}