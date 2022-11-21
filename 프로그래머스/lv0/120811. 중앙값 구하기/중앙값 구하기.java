import java.util.*;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int mid = array.length / 2; //중앙값의 인덱스
        
        Arrays.sort(array);
        answer = array[mid];
        return answer;
    }
}