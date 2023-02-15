class Solution {
    public int solution(int[][] lines) {
        int answer=0;
        int[][] move = new int[3][2];
		int[] count = new int[200];
		
		for(int i=0 ; i<3; i++) {
			for(int j=0 ; j<2 ; j++) {
				move[i][j] = lines[i][j]+100;
			}
			
			for(int k=move[i][0] ; k<move[i][1] ; k++) {
				count[k]++;
			}
		}
		
		for(int i=0 ; i<count.length ; i++) {
			if(count[i]>1) answer++;
		}
        
        return answer;
    }
}