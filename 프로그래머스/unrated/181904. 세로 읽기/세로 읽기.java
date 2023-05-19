class Solution {
    public String solution(String my_string, int m, int c) {
        String[] str = new String[my_string.length()/m + my_string.length()%m];
        
        String answer = "";
            
        for(int i=0 ; i<str.length ; i++){
            str[i] = my_string.substring(i*m, i*m+m);
            
            answer += str[i].charAt(c-1);
        }
        
        return answer;
    }
}