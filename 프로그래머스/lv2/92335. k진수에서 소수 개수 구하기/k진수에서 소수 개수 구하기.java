import java.util.*;

class Solution {
    //약수의 개수를 구하여 2개일 경우 소수
	public boolean isPrime(long number) {
		if(number==1) return false;
		
		for(int i=2 ; i<=(int)Math.sqrt(number) ; i++) {
			if(number%i == 0) return false;
		}
		
		return true;
	}
	
    public int solution(int n, int k) {
        int answer=0;
		String s;
		
		//10진법으로 변환하는 경우
		if(k==10) {
			s = Integer.toString(n);
		}else { //이외의 경우
			s = Integer.toString(n,k);
		}
		
		//0을 기준으로 분할 후 배열에 저장
		String[] arr = s.split("0");
		
		//각 배열의 값이 소수인지 확인 (공백인 경우는 제외)
		for(String num : arr) {
			if(!num.isEmpty() && isPrime(Long.parseLong(num))) {
				answer++;
			}
		}
		
		//개수 출력
		return answer;
    }
}