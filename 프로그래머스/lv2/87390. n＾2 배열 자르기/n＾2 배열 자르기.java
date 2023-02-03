class Solution {
    /*
     * n을 기준으로 갖는 규칙 찾기
     * 2차원 배열의 각각의 값 : (행,열)의 최댓값 + 1
     * 1차원 배열로 변경 후 인덱스와 2차원배열의 행 및 열의 관계는
     * 행 : 인덱스/n
     * 열 : 인덱스%n
     */
    public int[] solution(int n, long left, long right) {
        int[] answer = new int[(int)(right - left + 1)];
		
		for(int i=0 ; i<answer.length ; i++) {
			//행의 값 구하기
			int row = (int)(left/n);
			//열의 값 구하기
			int col = (int)(left%n);
			//해당 위치의 값 구하기
			answer[i] = Math.max(row, col)+1; 
			
			left++;
		}
		
		return answer;
    }
}