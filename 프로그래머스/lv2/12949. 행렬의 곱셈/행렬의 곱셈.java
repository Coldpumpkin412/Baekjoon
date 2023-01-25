import java.util.*;

class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr2[0].length];
        
        for(int row=0 ; row<arr1.length ; row++){
              for(int col=0 ; col<arr2[0].length ; col++){
                  for(int k = 0 ; k < arr1[0].length ; k++) {
                      answer[row][col] += arr1[row][k] * arr2[k][col];
                  }
              }
          }
        
        return answer;
    }
}