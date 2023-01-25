import java.util.*;

class Solution {
	/*
	 * n칸 까지 이동하는 경우의 수 : n-1칸 까지 이동하는 경우의 수 + n-2칸까지 이동하는 경우의 수
	 * 1칸을 이동하는 경우의 수 : 1개
	 * 2칸을 이동하는 경우의 수 : 2개
	 * 
	 * 다이나믹 프로그래밍 활용하여 시간 줄이기
	 */
	
	public long solution(int n) {
		long answer[] = new long[2001];
		
		answer[1] = 1; //한 칸을 뛰는 경우의 수 : 1
		answer[2] = 2; //두 칸을 뛰는 경우의 수 : 2
		
		for(int i=3 ; i<=n ; i++) answer[i] = (answer[i-1]+answer[i-2]) % 1234567;
		
		return answer[n];
	}
}