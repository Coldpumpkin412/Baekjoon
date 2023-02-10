import java.util.*;

class Solution {
    public int solution(int[][] dots) {
		int width=0; //가로
		int vertical=0; //세로
		
		for(int i=1 ; i<dots.length ; i++) {
			if(dots[0][0] == dots[i][0]) {
				vertical = Math.abs(dots[i][1]-dots[0][1]); break;
			}
		}
		
		for(int i=1 ; i<dots.length ; i++) {
			if(dots[0][1] == dots[i][1]) {
				width = Math.abs(dots[i][0]-dots[0][0]); break;
			}
		}
        return width*vertical;
    }
}