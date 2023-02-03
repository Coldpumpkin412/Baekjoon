import java.util.Calendar;

class Solution {
    public String solution(int a, int b) {
        String answer = "";
        
        //Calendar 클래스 활용하여 문제풀이
        Calendar cal = Calendar.getInstance();
                 
        cal.set(2016, a-1, b); //년도는 2016년, 월은 0~11로 세팅 되기 때문에 -1해주기
        int day = cal.get(Calendar.DAY_OF_WEEK); //'일'은 숫자료 표시됨
        
        switch(day){
            case 1: answer = "SUN"; break;
            case 2: answer = "MON"; break;
            case 3: answer = "TUE"; break;
            case 4: answer = "WED"; break;
            case 5: answer = "THU"; break;
            case 6: answer = "FRI"; break;
            case 7: answer = "SAT"; break;
        }
        
        return answer;
    }
}