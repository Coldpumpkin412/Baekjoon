class Solution {
    public boolean solution(int x) {
        int sum=0;      
        String s = Integer.toString(x); //x를 문자열로 변환
        
        for(int i=0 ; i<s.length() ; i++){
            sum += s.charAt(i)-'0'; //각 자리를 정수로 변환 후 더해주기
        }
        
        if(x%sum==0) return true;
        else return false;
    }
}