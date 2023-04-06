import java.util.*;

class Solution {
    public int[] solution(String[] park, String[] routes) {
        //시작위치 확인
		int[] answer = new int[2];
		
		for(int i=0; i<park.length ; i++) {
			for(int j=0 ; j<park[i].length() ; j++) {
				if(park[i].charAt(j) == 'S') {
					answer[0] = i;
					answer[1] = j;
				}
			}
		}
		
		for(int i=0 ; i<routes.length ; i++) {
			//해당 좌표 저장
			int row = answer[0];
			int col = answer[1];
			
			
			boolean check = true;
			//route배열의 이동횟수 만틈 for문 반복 (BFS풀이와 비슷)
			for(int j=0 ; j<routes[i].charAt(2)-'0' ; j++) {
				
				//방향변수
				char dir = routes[i].charAt(0);
				
				if(dir == 'N') row--;
				else if(dir == 'S') row++;
				else if(dir == 'W') col--;
				else col++;
				
				//맵을 벗어나거나 X를 만나는경우
				if(row<0 || row>=park.length || col<0 || col>=park[0].length() || park[row].charAt(col)=='X') {
					check = false;
					break;
				}
			}
			
			if(check) {
				answer[0] = row;
				answer[1] = col;
			}
		}
		
		return answer;
    }
}