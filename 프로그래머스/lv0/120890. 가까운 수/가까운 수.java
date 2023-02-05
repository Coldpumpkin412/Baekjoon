import java.util.*;

class Solution {
    public int solution(int[] array, int n) {
        int min = 100;
        int answer=0;
        
        for(int i=0 ; i<array.length ; i++){
            if(Math.abs(array[i]-n) < min){
                min = Math.abs(array[i]-n);
                answer = array[i];
            }
            else if(Math.abs(array[i]-n) == min){
                answer = (array[i-1] > array[i]) ? array[i] : array[i-1];
            }
        }
        return answer;
    }
}