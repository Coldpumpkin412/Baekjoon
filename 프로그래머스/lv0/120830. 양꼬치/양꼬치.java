class Solution {
    public int solution(int n, int k) {
        //양꼬치 가격 : 12000*n
        //음료수 가격 : 2000*k
        // 음료수 개수는 k-n/10
        
        int answer = 12000*n + 2000*(k - n/10);
        
        return answer;
    }
}