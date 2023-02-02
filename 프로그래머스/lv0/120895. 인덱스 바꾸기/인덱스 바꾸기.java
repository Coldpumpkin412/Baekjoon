class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        char[] chars = my_string.toCharArray(); //문자열을 배열로 변경
        char tmp; //문자열 변경시 활용할 매개변수
        
        //인덱스 해당문자 변경
        tmp = chars[num1];
        chars[num1] = chars[num2];
        chars[num2] = tmp; 
        
        answer = new String(chars);
        return answer;
    }
}