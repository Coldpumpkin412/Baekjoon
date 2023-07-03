import java.util.*;

class Solution {
    public long[] solution(long[] numbers) {
		/*
		 * 홀, 짝 경우에 따라 나눠서 풀기
		 * 1) 짝수 : 이진수 표현 시 마지막 자리수는 항상 0, 이것을 1로 바꿔주기 위해 +1 해주기
		 * 2) 홀수 : 끝자리부터 1이 연속으로 등장하는 횟수(cnt) 체크, 이후에 '01'을 '10'으로 바꿔주기
		 * 			ex) 01111 => 10111 
		 * 				(1이 4번 연속 나왔으므로) answer = num+2^(cnt-1)
		 */
		long[] answer = new long[numbers.length];
		
		for(int i=0 ; i<numbers.length ; i++) {
			//짝수인 경우 num+1
			if(numbers[i]%2 == 0) {
				answer[i] = numbers[i] + 1;
			}else {//홀수인 경우 num+2^(cnt-1)
				long number = numbers[i];
				
				//1이 연속되는 횟수 확인변수 및 연속되는 1이 몇개인지 찾기
				int cnt = 0;
				while(number>0) {
					if(number%2==1) cnt++;
					else break;
					
					number /= 2;
				}
				
				answer[i] = numbers[i] + (long)Math.pow(2, cnt-1);
			}
		}
		
		return answer;
    }
}