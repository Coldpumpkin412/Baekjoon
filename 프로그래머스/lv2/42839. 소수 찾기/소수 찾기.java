import java.util.HashSet;
import java.util.Iterator;

class Solution {
    HashSet<Integer> numberSet = new HashSet<>();
    
	public void recursive(String comb, String others) {
		//comb : 여태까지 조합한 숫자, others : 여태까지 쓰지 않은 숫자
		
		//현재 조합을 Set에 추가(맨처음에 빈문자열이 들어오므로 그것만 주의)
		if(!comb.equals("")) numberSet.add(Integer.valueOf(comb));
		
		//남은 숫자 중 한 개를 더 해 새로운 조합을 만든다.
		for(int i=0 ; i<others.length() ; i++) {
			recursive(comb + others.charAt(i), others.substring(0,i) + others.substring(i+1));
		}
	}
    
	public boolean isPrime(int num) {
		//0과 1은 소수가 아니다
		if(num==0 || num==1) return false;
		
		//에라토스테네스의 체의 limit 계산(제곱근)
		int limit = (int)Math.sqrt(num);
		
		//에라토스테네스의 체에 따라 limit까지만 배수 여부를 확인
		for(int i=2 ; i<=limit ; i++) {
			if(num%i==0) return false;
		}
		return true;
	}
    
    public int solution(String numbers) {
        int answer=0;
		
		//모든 조합의 숫자 만들기(Set을 활용하여 중복제거)
		recursive("", numbers);
		
		//소수의 개수만 센 후 반환(이터레이터 사용 (hasNext, next, remove))
		Iterator<Integer> it = numberSet.iterator();
		while(it.hasNext()) { //numberSet에 다음요소가 있는가
			int number = it.next(); //이터레이터에 있는 요소(숫자)들을 가져오기
			
			if(isPrime(number)) answer++; //소수라면++
		}
		
		return answer;
    }
}