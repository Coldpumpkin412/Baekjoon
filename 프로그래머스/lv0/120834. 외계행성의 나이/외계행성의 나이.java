class Solution {
    public String solution(int age) {
        //age를 문자열로 변경 후 문자 배열로 변경
        char[] chars = Integer.toString(age).toCharArray(); 
        int[] ints  = new int[chars.length];
        String answer = "";
        
        for(int i=0 ; i<chars.length ; i++){
            ints[i] = chars[i]-48; //아스키 코드 활용하여 answer 배열에 정수형으로 저장
        }
        
        for(int i=0 ; i<ints.length ; i++){
            //아스키 코드 활용하여 다시 문자로 변경 후 문자열에 저장
            answer += (char)(ints[i]+97); 
        }
        
        return answer;
    }
}