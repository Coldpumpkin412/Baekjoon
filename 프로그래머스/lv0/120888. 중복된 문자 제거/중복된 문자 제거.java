class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        answer += my_string.charAt(0);
        
        for(int i=1 ; i<my_string.length() ; i++){
            int count=0;
            
            for(int j=0 ; j<i ; j++){
                if(my_string.charAt(i) == my_string.charAt(j)){
                    count++;
                }
            }
            
            if(count == 0){
                answer += my_string.charAt(i);
            }
        }
        return answer;
    }
}