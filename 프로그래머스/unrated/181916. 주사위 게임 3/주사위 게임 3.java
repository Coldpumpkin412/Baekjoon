import java.util.*;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 1;
        
        //key : 주사위 눈, value : 나온 빈도 수
        Map<Integer, Integer> map = new HashMap<>();
        
        map.put(a, map.getOrDefault(a, 0) + 1);
        map.put(b, map.getOrDefault(b, 0) + 1);
        map.put(c, map.getOrDefault(c, 0) + 1);
        map.put(d, map.getOrDefault(d, 0) + 1);
        
        //전부 다 같은 눈인경우
        if(map.size() == 1){
            return 1111*a;
        }else if(map.size() == 4){
            //전부 다 다른 눈인경우
            return Math.min(a, (Math.min(b, Math.min(c,d))));
        }else if(map.size() == 3){
            //빈도수가 2,1,1인경우
            for(int number : map.keySet()){
                if(map.get(number)==1){
                    answer *= number;
                }
            }
            
            return answer;
            
        }else{ //map의 사이즈가 2인경우
            if(map.containsValue(1)){ //눈의 빈도수가 각각 1,3인경우
                answer = 0;
                
                for(int number : map.keySet()){
                    if(map.get(number) == 1){
                        answer += number;
                    }else{
                        answer += 10*number;
                    }
                }
                
                return answer*answer;
                
            }else{//눈의 빈도수가 2,2인경우
                int max = 0;
                int min = 7;
                
                for(int number : map.keySet()){
                    max = Math.max(max, number);
                    min = Math.min(min, number);
                }
                
                return Math.abs(max*max - min*min);
            }
        }
        
    }
}