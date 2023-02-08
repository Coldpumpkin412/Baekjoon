import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {		
        int answer=0; //같은 인형이 만나 터진 횟수
		
		//옮겨진 인형을 옮겨닮을 list 구현
		List<Integer> doll = new ArrayList<>();
		
		//옮겨졌을 때 앞의 숫자와 같다면 삭제 후 answer++
		for(int i : moves) {
			boolean check = true;
			for(int j=0 ; j<board.length ; j++) {
				if(board[j][i-1] != 0 && check) {
					check = false;
					doll.add(board[j][i-1]);
					board[j][i-1] = 0; //인형이 옮겨지면 해당위치는 0이됨
				}

			}
			//인형을 리스트로 옮긴 뒤 두개가 연속되는지 확인
			if(doll.size()>=2) {
				if(doll.get(doll.size()-1) == doll.get(doll.size()-2)) {
					//같은 인형이 연속된다면 위에서부터 하나씩 제거 후 횟수++
					doll.remove(doll.size()-1); 
					doll.remove(doll.size()-1);
					
					answer++;
				}
			}
		}
		//다 옮긴 후 result*2 (한번 터질때마다 두개 씩 터지므로)
		return answer*2;
    }
}