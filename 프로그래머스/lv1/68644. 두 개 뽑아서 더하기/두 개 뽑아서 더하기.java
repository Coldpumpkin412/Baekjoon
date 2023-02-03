import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        List<Integer> answer_list = new ArrayList<>();
        
        for(int i=0 ; i<numbers.length-1 ; i++){
            for(int j=i+1 ; j<numbers.length ; j++){
                answer_list.add(numbers[i]+numbers[j]);
            }
        }
        
        //중복제거를 위한 해시셋
        HashSet<Integer> arr = new HashSet<Integer>(answer_list);
        //다시 리스트로 선언
        List<Integer> new_list = new ArrayList<>(arr); 
        
        int[] answer = new int[new_list.size()];
        
        for(int i=0 ; i<new_list.size() ; i++){
            answer[i] = new_list.get(i).intValue();
        }
        
        Arrays.sort(answer); //오름차순 정렬
        
        return answer;
    }
}