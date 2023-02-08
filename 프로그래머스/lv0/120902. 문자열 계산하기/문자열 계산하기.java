class Solution {
    public int solution(String my_string) {
		String[] arr = my_string.split(" "); //공백을 기준으로 문자열 자르기
		int answer = Integer.parseInt(arr[0]); //초기값 부여
			
		
		for(int i=1 ; i<arr.length ; i+=2) {
			 if(arr[i].equals("+")) {
                 //덧셈이 나오면 그 다음 위치 값 더하기
				answer += Integer.parseInt(arr[i+1]); 
			}else {
                 //뺄셈이 나오면 그 다음 위치 값 빼기
				answer -= Integer.parseInt(arr[i+1]);
			}
		}
               
        return answer;
    }
}