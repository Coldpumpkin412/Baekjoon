import java.util.*;

class Solution {
    //실패율
    public static double failure(double stage, double num) {
        return stage/num;
	}
    
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        int all = stages.length; //총인원
		double[] fail = new double[N]; //층별 실패율 저장 배열

        //fail 배열값
        for(int i=1 ; i<=N ; i++) {
			int cnt=0;//i층에 도달하여 아직 클리어하지 못한 인원
                     
			for(int j=0 ; j<stages.length ; j++) {
                if(stages[j]==i) cnt++;
            }

			fail[i-1] = failure((double)cnt, (double)all);
            
            //남은 인원이 0명이면 실패율은 0으로 간주
            if(all==0){
                fail[i-1]=0.0;
            }
            
			all -= cnt;
		}
       
		double max=0;
		int target=1;
		for(int i=0 ; i<fail.length ; i++) {
			max = fail[0];
			target = 1;
			
			for(int j=0 ; j<fail.length ; j++) {
				if(fail[j]>max) {
					max = fail[j];
					target = j+1;
				}
			}
			
			fail[target-1] = -1;
			answer[i] = target;
		}
        
        
        
        return answer;
    }
}