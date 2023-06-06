import java.util.*;

class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        
        //현재위치
        int row = 0;
        int col = 0;
        
        //채울 숫자
        int number = 1;
        
        //이동 방향 (U,D,L,R)
        char dir = 'R'; 

        while (number <= n*n) {
            
            answer[row][col] = number++; 

            //다음 위치
            if (dir == 'R') { //오른쪽으로 이동
                if (col==n-1 || answer[row][col+1]!=0) {
                    dir = 'D';
                    row++;
                } else {
                    col++;
                }
            } else if (dir == 'D') { //아래로 이동
                if (row==n-1 || answer[row+1][col]!=0) {
                    dir = 'L';
                    col--;
                } else {
                    row++;
                }
            } else if (dir == 'L') { //왼쪽으로 이동
                if (col==0 || answer[row][col-1] != 0) {
                    dir = 'U';
                    row--;
                } else {
                    col--;
                }
            } else if (dir == 'U') { // 위쪽으로 이동
                if (row==0 || answer[row-1][col]!=0) {
                    dir = 'R';
                    col++;
                } else {
                    row--;
                }
            }
        }

        return answer;
    }
}