import java.util.*;

class Solution {
    public int solution(int[][] triangle) {
        /*
		 * 다이나믹 프로그래밍 활용하여 풀기
		 * 맨 아래부터 시작하여 두개의 값중 큰 값을 위의 값에 더해주며 최댓값을 찾아가기
		 */
		
		for (int i=triangle.length-1 ; i>0 ; i--) {
            for (int j=0 ; j<triangle[i].length-1 ;j++) {
                triangle[i-1][j] += Math.max(triangle[i][j], triangle[i][j+1]);
            }
        }
		
        return triangle[0][0];
    }
}