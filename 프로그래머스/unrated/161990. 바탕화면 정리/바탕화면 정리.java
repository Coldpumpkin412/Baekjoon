import java.util.*;

class Solution {
    public int[] solution(String[] wallpaper) {
        int[] answer = new int[4];
		
		//드래그 시작점은 최대값으로, 드래그 마지막점은 최소값으로 초기화
		int up = wallpaper.length;
		int left = wallpaper[0].length()-1;
		int down = 0;
		int right = 0;
		
		
		//#이 등장할 때 마다 각 좌표 갱신
		for(int i=0 ; i<wallpaper.length ; i++) {
			for(int j=0 ; j<wallpaper[i].length() ; j++) {
				if(wallpaper[i].charAt(j) == '#') {
					up = Math.min(up, i);
					left = Math.min(left, j);
					down = Math.max(down, i+1);
					right = Math.max(right, j+1);
				}
			}
		}
		//정답 배열에 각각 값을 할당
		answer[0] = up;
		answer[1] = left;
		answer[2] = down;
		answer[3] = right;
		
		return answer;
    }
}