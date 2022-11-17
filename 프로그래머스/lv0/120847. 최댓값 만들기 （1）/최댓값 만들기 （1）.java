import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        Arrays.sort(numbers); //오름차순 정렬
        answer = numbers[numbers.length-1] * numbers[numbers.length-2];
        
        return answer;
    }
}