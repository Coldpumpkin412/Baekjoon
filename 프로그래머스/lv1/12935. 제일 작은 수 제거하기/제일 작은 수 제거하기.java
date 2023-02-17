import java.util.*;
import java.util.Collections;

class Solution {
    public int[] solution(int[] arr) {
        int[] wrong = {-1}; //조건이 잘못됐을 경우 사용할 변수
        int[] answer = new int[arr.length-1];
        int min = arr[0]; //최소값 저장 변수
        List<Integer> list = new ArrayList<>();
        
        if(arr.length == 1){
            return wrong; //배열의 크기가 1이면 -1출력
        } 
        
        for(int i=1 ; i<arr.length ; i++){
            if(min > arr[i]) min=arr[i]; //최소값 설정
        }
        
        for(int i=0 ; i<arr.length ; i++){
            if(arr[i] == min) continue; //최소값일 경우 continue
            else{
                list.add(arr[i]); //최소값이 아닌경우 리스트에 추가
            }
        }
        
        for(int i=0 ; i<answer.length ; i++){
            answer[i] = list.get(i).intValue(); //리스트 값을 int 배열에 할당
        }
        
        return answer;
    }
}