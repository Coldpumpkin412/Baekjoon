import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        /*Set을 활용하여 풀기.
    	 * Set은 순서가 보장되지 않음
    	 * 중복이 허용되지 않음
    	 * contains()의 속도가 list보다 월등히 빠름
    	 * 데이터가 많지 않다면 성능보단 구조가 간단한 List를 활용하는게 나을 수 있음
    	 */
        
        //1.Set 만들기
        HashSet<Integer> resSet = new HashSet<>(); //여분의 체육복이 있는 인원
        HashSet<Integer> lostSet = new HashSet<>(); //체육복을 분실한 인원
        
        for(int i : reserve) resSet.add(i);
        for(int i : lost){
            //만약 체육복을 분실한 인원이 여분의 체육복이 있다면
            if(resSet.contains(i)) resSet.remove(i);
            else lostSet.add(i); //여분이 없다면 분실Set에 추가
        }
    	
    	//2.여분을 기준으로 앞,뒤 숫자 확인. 체육복 빌려주기
        
        for(int i : resSet){
            if(lostSet.contains(i-1)) lostSet.remove(i-1);
            else if(lostSet.contains(i+1)) lostSet.remove(i+1);
        }

    	//3.전체학생-lost Set 수하기
        return n-lostSet.size();

    }
}