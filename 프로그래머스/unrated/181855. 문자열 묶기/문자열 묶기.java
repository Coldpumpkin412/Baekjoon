import java.util.*;

class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        
        //key : 문자열길이, value : 빈도
        Map<Integer, Integer> map = new HashMap<>();
        
        for(String str : strArr){
            map.put(str.length(), map.getOrDefault(str.length(),0)+1);
        }
        
        for(int num : map.keySet()){
            answer = Math.max(answer, map.get(num));
        }
        
        return answer;
    }
}