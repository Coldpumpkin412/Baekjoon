class Solution {
    public int solution(int[] numbers) {
        int answer = 45; //0부터 9까지의 모든 합:45
        
        //numbers의 모든 원소를 하나씩 빼줌
        for(int i : numbers) answer -= i;

        return answer;
    }
}