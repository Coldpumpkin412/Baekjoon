import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        int count=1; //배열 뒤에서 부터 값 입력할 때 사용
        int[][] box = new int[score.length/m][m];
        
        Arrays.sort(score); //오름차순 정렬    
            
        for(int i=0 ; i<score.length/m ; i++){
            for(int j=0 ; j<m ; j++){
                box[i][j] = score[score.length-count];
                count++;
            }
            answer += box[i][m-1] * m;
        }
        return answer;
    }
}