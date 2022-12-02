class Solution {
    public long solution(long n) {
        long answer = 0;
        
        for(long i=1 ; i<=7071067 ; i++){
            if(i*i == n) return (i+1)*(i+1);
        }
        return -1;
    }
}