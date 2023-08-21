import java.util.*;

class Solution {
    public int[] solution(int n) {
        //정답배열 선언
		int[] answer = new int[n*(n+1)/2];
		
		//삼각달팽이를 정리해서 값을 넣어줄 배열 선언
		int[][] arr = new int[n][n];
		
		//시작지점
		int x = 0;
		int y = 0;
		
		//초기값
		int value = 1;
		arr[0][0] = 1;
		
		while(value<n*(n+1)/2) {
			//왼쪽부분(위→아래)
			while(x+1<n && arr[x+1][y]==0) {
				//아래로 내려가면서 1씩증가
				arr[++x][y] = ++value;
			}
			
			//맨 아래부분(왼→오른)
			while(y+1<n && arr[x][y+1]==0) {
				arr[x][++y] = ++value;
			}
			
			//대각선부분(오른쪽아래→위)
			while(y-1>0 && x-1>0 && arr[x-1][y-1]==0) {
				arr[--x][--y] = ++value;
			}
		}
		
		//정답저장
		List<Integer> list = new ArrayList<>();
		for(int i=0 ; i<n ; i++) {
			for(int j=0 ; j<=i ; j++) {
				list.add(arr[i][j]);
			}
		}
		
		for(int i=0 ; i<list.size() ; i++) {
			answer[i] = list.get(i);
		}
		return answer;
    }
}