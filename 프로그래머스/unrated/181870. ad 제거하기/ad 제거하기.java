import java.util.*;

class Solution {
    public String[] solution(String[] strArr) {
        List<String> list = new ArrayList<>();
        
        for(int i=0 ; i<strArr.length ; i++){
            if(strArr[i].contains("ad")){
                continue;
            }else{
                list.add(strArr[i]);
            }
        }
        
        String[] answer = list.toArray(new String[list.size()]);
        
        return answer;
    }
}