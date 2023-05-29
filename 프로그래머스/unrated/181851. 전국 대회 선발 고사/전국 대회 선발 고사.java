import java.util.*;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int[] score = new int[rank.length+1];
        Arrays.fill(score, -1);
        
        
        for(int i=0 ; i<rank.length ; i++){
            if(attendance[i]){
                score[rank[i]] = i;
            }
        }
        
        int[] answer = new int[3];
        
        int index = 0;
        for(int i=0 ; i<score.length ; i++){
            if(index==3) break;
            
            if(score[i]!=-1){
                answer[index] = score[i];
                index++;
            }
        }
        
        return 10000*answer[0] + 100*answer[1] + answer[2];
    }
}