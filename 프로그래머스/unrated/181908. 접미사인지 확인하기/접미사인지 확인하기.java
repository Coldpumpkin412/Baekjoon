class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        int index = 0;
        
        while(index<my_string.length()){
            String str = my_string.substring(index, my_string.length());
            
            if(str.equals(is_suffix)){
                answer = 1;
                break;
            }
            index++;
        }
        return answer;
    }
}