class Solution {
    public int solution(int n) {
        int answer = 0;
        int i=1;
        
        while(i<=1000){
            if(n == i*i) return 1;
            else i++;
        }
        return 2;
    }
}