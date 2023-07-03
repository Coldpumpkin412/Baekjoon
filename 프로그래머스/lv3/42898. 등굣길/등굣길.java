class Solution {
    public int solution(int m, int n, int[][] puddles) {
        /*
		 * 가장 오른쪽 아래가 학교의 좌표이므로 (m-1,n-1)이다.
		 * 해당 좌표까지 가는 최단거리 경우의 수를 1000000007로 나눈 나머지를 구하기
		 * 
		 * 어떤 좌표까지 가는 최단 거리 경우의 수 : 해당 좌표의 위쪽까지 가는 경우의 수 + 왼쪽까지 가는 경우의 수
		 */
		
		//맵 및 시작 위치 선언, 초기화
		int[][] map = new int[n][m];
		map[0][0] = 1;
		
		//모듈러에 활용할 변수
		int div = 1000000007; 
		
		//웅덩이 위치에 -1 입력
		for(int[] pud : puddles) {
			map[pud[1]-1][pud[0]-1] = -1;
		}
		
		for(int i=0 ; i<n ; i++) {
			for(int j=0 ; j<m ; j++) {
				//웅덩이인 경우 0으로 바꾼 후 continue (더할 때 간편해짐)
				if(map[i][j]==-1) {
					map[i][j] = 0;
					continue;
				}
				
				if(i != 0) {
					map[i][j] += map[i-1][j] % div;
				}
				
				if(j != 0) {
					map[i][j] += map[i][j-1] % div;
				}
			}
		}
		return map[n-1][m-1] % div;
    }
}