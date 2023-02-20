import java.util.*;

class Solution {
    public int solution(String dirs) {
        int answer = 0;
		/*
		 * 이미 지나간 거리를 또 지나갈시에는 무시해야하므로 중복제거를 위한 해시셋을 사용
		 * 좌표의 경우 (0,0)→(0.1)과 (0,1)→(0,0)은 같은 것이므로
		 * 좌표 두 개를 오름차순으로 문자열로 받으면 중복이 해결된다.
		 * ex)위에 경우 둘 다 0001로 변환 됨
		 */
		
		//문자열로 변환 후 합쳐진 두개의 좌표를 저장할 해시셋 선언
		Set<String> route = new HashSet<>();
		
		//X 및 Y좌표 최화
		int X = 0;
		int Y = 0;
		
		for(int i=0 ; i<dirs.length() ; i++) {
			//현재 X 및 Y 좌표
			int next_X = X;
			int next_Y = Y;
			
			//좌표 두개(현재+이동)를 '오름차순형태' 문자열로 저장한 변수
			String coor ="";
			
			//위로 가는 경우
			if(dirs.charAt(i) == 'U') {
				next_Y++;
				coor += X;
				coor += Y;
				coor += next_X;
				coor += next_Y;
			}else if(dirs.charAt(i) == 'D') {//아래로 가는 경우
				next_Y--;
				coor += next_X;
				coor += next_Y;
				coor += X;
				coor += Y;
			}else if(dirs.charAt(i) == 'R'){ //오른쪽으로 가는 경우
				next_X++;
				coor += X;
				coor += Y;
				coor += next_X;
				coor += next_Y;
			}else if(dirs.charAt(i) == 'L') {//왼쪽으로 가는 경우
				next_X--;
				coor += next_X;
				coor += next_Y;
				coor += X;
				coor += Y;
			}
			
			//범위를 벗어날 경우 무시해주기
			if(next_X<-5 || next_X>5 || next_Y<-5 || next_Y>5) continue;
			
			
			//해시셋에 저장 (중복 자동으로 제거됨)
			route.add(coor);
			
			//좌표 최신화
			X = next_X;
			Y = next_Y;
		}
		
		return route.size();
    }
}