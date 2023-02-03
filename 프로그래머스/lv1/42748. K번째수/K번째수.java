import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for(int i=0 ; i<commands.length ; i++){
            int start = commands[i][0];
            int end = commands[i][1];
            int count = commands[i][2];
            
            int[] list = new int[end-start+1];
            
            for(int j=start ; j<=end ; j++){
                list[j-start] = array[j-1];
            }
            Arrays.sort(list); //오름차순 정렬
            
            answer[i] = list[count-1];
        }
        
        return answer;
    }
}