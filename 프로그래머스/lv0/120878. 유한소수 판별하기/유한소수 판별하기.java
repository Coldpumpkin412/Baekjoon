class Solution {
    public int solution(int a, int b) {
        //기약분수로 나타내기 위해서는 우선 최대공약수를 알아야한다.
        
        int max = 0; //최대공약수 변수
        int start = 2;
        
        for(int i=1 ; i<=a && i<=b ; i++){ //0으로 나눠지는것을 예방하기 위해 1부터 시작
            if(a%i==0 && b%i==0) max = i;
        }
        
        b /= max; //기약분수로 표현 후의 분모값
        
        while(b>=2){
            if(b%start == 0){
                if(start!=2 && start!=5) return 2; //무한소수인경우
                b/=start;
            } else start++;
        }
        
        return 1; //유한소수인 경우
    }
}