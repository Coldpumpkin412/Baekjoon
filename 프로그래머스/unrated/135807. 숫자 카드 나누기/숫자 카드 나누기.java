class Solution {
	public boolean Divisible(int[] arr, int num) {
		for(int n : arr) { //배열 값 하나씩 빼오기
			if(n%num==0) return false; //나눠지는 값이 존재한다면 false
		}
		return true;
	}
	public int gcd(int a, int b) {
		if(a%b==0) return b; //나머지가 0일때 작은 숫자가 최대공약수
		return gcd(b, a%b);
	}
	
	public int solution(int[] arrayA, int[] arrayB) {
		int answer=0;
		
		//두 배열의 각각 최대공약수 구하기(유클리드 호제법 사용)
		int gcdA = arrayA[0];
		int gcdB = arrayB[0];
		
		for(int i=1 ; i<arrayA.length ; i++) {
			gcdA = gcd(gcdA, arrayA[i]);
			gcdB = gcd(gcdB, arrayB[i]);
		}
		
		//각각의 최대공약수로 서로의 배열을 나눌 수 있는지 확인
		if(Divisible(arrayB, gcdA)) { //A배열의 최대공약수로 B배열의 값들 중 나눠지는게 있는지
			if(answer<gcdA) {
				answer = gcdA;
			}
		}
		if(Divisible(arrayA, gcdB)) { //B배열의 최대공약수로 A배열의 값들 중 나눠지는게 있는지
			if(answer<gcdB) {
				answer = gcdB;
			}
			
		}
		
		return answer;
	}
}