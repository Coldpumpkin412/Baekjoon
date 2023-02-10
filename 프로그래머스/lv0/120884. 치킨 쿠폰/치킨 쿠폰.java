class Solution {
    public int solution(int chicken) {
        int NUM = 10;
        int answer = 0;

        while (chicken >= NUM) {
            int newChick = chicken/NUM;
            int restChick = chicken%NUM;
            chicken = newChick + restChick;

            answer += newChick;
        }

        return answer;
    }
}