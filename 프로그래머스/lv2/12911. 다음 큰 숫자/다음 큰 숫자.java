class Solution {
	
	public int solution(int n) {
		/*
		 * Integer.bitCount() 사용
		 * 매개변수를 2진변환 시켰을 때 1의 개수 반환
		 */
		int answer=n+1;

		while(Integer.bitCount(n) != Integer.bitCount(answer)) answer++;
		
		return answer;
	}
}