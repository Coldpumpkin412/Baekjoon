class Solution {
    public String[] solution(String my_str, int n) {
        int size; //정답 배열의 크기
        
        //배열 크기 정하기
        if(my_str.length()%n != 0){
            size = my_str.length()/n + 1; 
        } else size = my_str.length()/n;
        
        String[] answer = new String[size];
        String str = new String(); //문자열을 저장할 매개변수 생성
        
        for(int i=0 ; i<size ; i++){
            str = new String(); //문자열 초기화
            
            for(int j=i*n ; j<(i+1)*n ; j++){
                str += my_str.charAt(j); 
                
                //문자열길이 끝에 닿으면 그떄까지의 값까지 저장하고 반환
                if(j == my_str.length()-1){
                    answer[i] = str;
                    return answer;
                }
            }
            
            answer[i] = str;
        }
        
        return answer;
    }
}