class Solution {
    public String solution(String bin1, String bin2) {
        //이진수로 주어진 조건을 10진수로 변환
        int bin1_1 = Integer.parseInt(bin1, 2); 
        int bin2_1 = Integer.parseInt(bin2, 2);
        
        int sum = bin1_1 + bin2_1; //10진수 변환 후 덧셈
        
        //2진수로 변경
        String answer = Integer.toBinaryString(sum);
        
        return answer;
    }
}