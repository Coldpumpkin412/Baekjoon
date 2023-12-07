class Solution {
    public int solution(String[][] board, int h, int w) {
        int answer = 0;
        
        //보드의 가로세로 길이
        int size = board.length;
        
        //방향변수 설정
        int[] dx = {-1,1,0,0};
        int[] dy = {0,0,-1,1};
        
        //고른 칸의 색 저장할 변수
        String color = board[h][w];
        
        //고른칸 기준 4가지 방향에 대해
        for(int i=0 ; i<4 ; i++){
            //다음 행 및 다음 열 변수
            int next_row = h + dx[i];
            int next_col = w + dy[i];
            
            //다음 행,열이 맵을 벗어나는 경우 건너뛰기
            if(next_row<0 || next_row>=size || next_col<0 || next_col>=size){
                continue;
            }
            
            //같은 색이라면 횟수 증가
            if(color.equals(board[next_row][next_col])){
                answer++;
            }
        }
        
        return answer;
    }
}