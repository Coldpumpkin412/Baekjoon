import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        ArrayList<Integer> list = new ArrayList<>(); //가변길이를 갖는 리스트 선언
        
        for(int i=0 ; i<my_string.length() ; i++){
            if('a'<=my_string.charAt(i) && my_string.charAt(i)<='z') continue;
            else list.add(my_string.charAt(i)-'0');
            //숫자인 경우 리스트에 요소 추가
        }
        
        int[] answer = new int[list.size()]; //리스트의 크기와 같은 크기를 갖는 배열 선언
        
        for(int i=0 ; i<list.size() ; i++){
            answer[i] = list.get(i).intValue(); //리스트의 값을 정수형으로 배열에 넣기
        }
        
        Arrays.sort(answer); //오름차순 정렬
        
        return answer;
    }
}