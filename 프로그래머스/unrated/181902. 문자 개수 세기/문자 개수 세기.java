class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        
        for(int i=0 ; i<my_string.length() ; i++){
            char ch = my_string.charAt(i);
            
            if('A'<=ch && ch<='Z'){
                answer[ch-65]++;
            }else{
                answer[ch-71]++;
            }
        }
        
        return answer;
    }
}