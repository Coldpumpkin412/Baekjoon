import java.util.*;

class Solution {
    public int solution(int m, int n, String[] board) {
        int answer = 0;
		
		//주어진 보드를 문자(char)배열로 변환
		char[][] char_board = new char[m][n];
		for(int i=0 ; i<m ; i++) {
			char_board[i] = board[m-i-1].toCharArray();
		}
		
		while(true) {
			//확인변수 및 확인맵 선언
			boolean check = true;
			boolean[][] check_board = new boolean[m][n];
			
			//제거할 수 있는 4블록 확인
			for(int i=0 ; i<m-1 ; i++) {
				for(int j=0 ; j<n-1 ; j++) {
					//블록이 제거되어서 '-'로 돼있다면 넘어가기
					if(char_board[i][j]=='-') {
						continue;
					}
					
					//알파벳인경우 변수로 선언
					char ch = char_board[i][j];
					
					//나머지 주위 세 부분도 같은 알파벳인경우
					if(char_board[i][j+1]==ch && char_board[i+1][j]==ch && char_board[i+1][j+1]==ch) {
						//체크보드를 참으로 변환
						check_board[i][j] = true;
						check_board[i+1][j] = true;
						check_board[i][j+1] = true;
						check_board[i+1][j+1] = true;
						
						//확인변수도 변환
						check = false;
					}
				}
			}
			
			//확인변수가 true라면 지울 블록이 없으므로 반복문에서 나가기
			if(check) {
				break;
			}
			
			//확인맵을 확인하여 같은위치에 char_board를 '-'로 치환
			for(int i=0 ; i<m ; i++) {
				for(int j=0 ; j<n ; j++) {
					//true로 변환돼있는 곳을 확인
					if(check_board[i][j]) {
						char_board[i][j] = '-';
						
						//지워진 블록 수 증가
						answer++;
					}
				}
			}
			
			//제거한 공간을 아래로 내리는 로직
			for(int i=0 ; i<m ; i++) {
				for(int j=0 ; j<n ; j++) {
					//'-'으로 되어있는 블록은 윗블록과 교체
					if(char_board[i][j]=='-') {
						for(int k=i ; k<m ; k++) {
							//아래부분도 '-'(제거된상태)라면 넘어가기
							if(char_board[k][j]=='-') {
								continue;
							}
							
							//아래에 알파벳인 부분과 바꿔주기
							char_board[i][j] = char_board[k][j];
							char_board[k][j] = '-';
							break;
						}
					}
				}
			}
            
		}
		return answer;
    }
}