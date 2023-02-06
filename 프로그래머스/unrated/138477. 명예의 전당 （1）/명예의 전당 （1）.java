import java.util.*;
import java.util.Comparator;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        List<Integer> list = new ArrayList<>();
        
        for(int i=0 ; i<score.length ; i++){
            if(list.size()<k){
                list.add(score[i]);
                list.sort(Comparator.reverseOrder()); //내림차순 정렬
				answer[i] = list.get(list.size()-1);
            }else{
				list.add(score[i]);
				list.sort(Comparator.reverseOrder());
				answer[i] = list.get(k-1);
            }
        }
        return answer;
    }
}