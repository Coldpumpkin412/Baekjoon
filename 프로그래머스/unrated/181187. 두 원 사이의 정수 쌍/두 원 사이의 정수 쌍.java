import java.util.*;
import java.math.*;

class Solution {
    public long solution(int r1, int r2) {
        /*
		 * 원의방정식 활용(x^2 + y^2 = r^2 / 원 두개 모두 원점이 중심이므로)
		 * 
		 * 원의방정식을 활용하여 x좌표에 따른 y좌표의 값의 개수를 구해준다.
		 * 축이 겹치게하지 않기 위해 x좌표는 1부터 시작한다(1사분면만 구한다).
		 * 큰 원의 y값과 작은 원의 y값 사이에 정수를 구해야하므로 각각을 내림, 올림한다.
		 * 
		 * 이 후 개수를 구해준다
		 */
		long answer = 0;
		
		for(int i=1 ; i<=r2 ; i++) {
			//작은원의 y좌표
			double y1 = Math.sqrt(Math.pow(r1, 2) - Math.pow(i, 2));
			
			//큰 원의 y좌표
			double y2 = Math.sqrt(Math.pow(r2, 2) - Math.pow(i, 2));
			
			//작은원의 y좌표를 올림 후 +1하여 개수 구해주기(이상 이하이므로)
			answer += ((long)y2 - (long)Math.ceil(y1) + 1);
		}
		
		//4사분면에 대해 모두 구하므로 4를 곱해준 후 출력
		return 4 * answer;
    }
}