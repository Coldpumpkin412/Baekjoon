class Solution {
    public int solution(String my_string, String is_prefix) {
        
        int answer = 0;
        int index = 1;
        
        while(index<=my_string.length()-1){
            String str = my_string.substring(0,index);
            
            if(str.equals(is_prefix)) {
                answer = 1;
                break;
            }
            
            index++;
        }
        
        return answer;
        
    }
}