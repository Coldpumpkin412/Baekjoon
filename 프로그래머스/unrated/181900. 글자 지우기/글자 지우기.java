class Solution {
    public String solution(String my_string, int[] indices) {
        char[] ch = new char[my_string.length()];
        
        for(int i=0 ; i<my_string.length() ; i++){
            ch[i] = my_string.charAt(i);
        }
        for(int i=0 ; i<indices.length ; i++){
            ch[indices[i]] = ' ';
        }
        
        String answer ="";
        for(int i=0 ; i<ch.length ; i++) {
        	if('a'<=ch[i] && ch[i]<='z') answer += ch[i];
        }
        
        return answer;
    }
}