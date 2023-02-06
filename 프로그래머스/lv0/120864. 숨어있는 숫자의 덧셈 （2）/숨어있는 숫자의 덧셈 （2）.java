class Solution {
    public int solution(String my_string) {
        int answer=0;
        my_string = my_string.replaceAll("\\D", " ").replaceAll("\\s+", " ").trim();
        //replaceAll("\\D", " ") 활용하여 숫자 이외의 문자들은 공백으로 치환
        //replaceAll("\\s+", " ") 활용하여 한 칸 이상의 공백을 한 칸의 공백으로 치환
        //trim() 활용하여 앞 뒤 공백 제거
        
        if(my_string.isEmpty()){
            return 0; //문자열에 자연수가 없는경우 0 리턴
        }
        
        String[] num = my_string.split("\\s"); //공백을 기준으로 분할하여 배열에 저장
        
        for(String sum : num){
            sum = sum.trim(); //앞뒤 공백 제거
            answer += Integer.parseInt(sum); //문자열을 정수로 변경 후 더해주기
        }
        return answer;
    }
}