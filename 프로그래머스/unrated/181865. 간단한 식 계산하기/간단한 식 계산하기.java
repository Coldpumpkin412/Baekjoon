class Solution {
    public int solution(String binomial) {
        String[] answer = binomial.split(" ");
        
        int num1 = Integer.parseInt(answer[0]);
        int num2 = Integer.parseInt(answer[2]);
        
        if(answer[1].equals("+")){
            return num1 + num2;
        }else if(answer[1].equals("-")){
            return num1 - num2;
        }else{
            return num1 * num2;
        }
    }
}