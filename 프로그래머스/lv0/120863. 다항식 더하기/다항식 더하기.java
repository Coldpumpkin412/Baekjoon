class Solution {
    public String solution(String polynomial) {    
        String[] str = polynomial.split("\\+"); // +를 기준으로 문자열 나눔
        String answer = "";

        for(int i=0; i<str.length; i++)  str[i] = str[i].trim(); //공백제거
        
        int xSum = 0;
        int nSum = 0;
        
        for(int i=0; i<str.length; i++) {
            if(str[i].contains("x")) {  // x가 포함된 경우
                if(str[i].length() == 1) xSum += 1;
                else xSum += Integer.valueOf(str[i].replace("x", "")).intValue();
            } else nSum += Integer.valueOf(str[i]).intValue();
        }
        
        //조합에 따른 출력값 선정
        if(xSum == 1 && nSum != 0) answer = "x + " + String.valueOf(nSum);
        if(xSum == 1 && nSum == 0) answer = "x";
        if(xSum > 1 && nSum != 0) answer = String.valueOf(xSum) + "x + " + String.valueOf(nSum);
        if (xSum == 0 && nSum != 0) answer = String.valueOf(nSum);
        if (xSum > 1 && nSum == 0) answer = String.valueOf(xSum) + "x";
        
        return answer;
    }
}