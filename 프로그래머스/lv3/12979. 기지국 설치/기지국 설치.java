class Solution {
    public int solution(int n, int[] stations, int w) {
        
		/*
		 * 기지국 위치를 기점으로 전파의 영향범위는 양옆 w만큼 + 자기자신
		 * 즉 2*w + 1이다. 이 점을 활용하기
		 */
		int answer = 0;
		
		//시작점 및 인덱스 초기값 설정
		int start = 0;
		int index = 1;
		
		while(index<=n) {
			//이미 설치된 기지국 영향권인 경우 index를 영향권 다음 지점으로 이동
			if(start<stations.length && stations[start]-w<=index) {
				index = stations[start]+w+1;
				start++;
			}else {
				//영향권 밖인 경우 기지국 추가설치(answer++)
				//이 때 최대 범위인 2*w+1에 인덱스를 위치 시킴
				answer++;
				index += 2*w+1;
			}
		}
		return answer;
    }
}