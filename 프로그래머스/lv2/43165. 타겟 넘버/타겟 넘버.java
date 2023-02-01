class Solution {
    /*
	 * DFS,재귀함수 활용
	 * 각 숫자별로 +or-이기 때문에 시간복잡도: 2^n
	 * 주어지는 숫자의 개수가 20개 이하, 최악의경우 = 2^20 : 대략 100만(500만 이하이기떄문에 완전탐색 활용가능)
	 */
	
	//재귀함수를 여러번 호출하기때문에 멤버변수로 담아놓고 사용
	int[] numbers;
	int target;
	int answer;
    
    //DFS함수 구현(재귀)
	void DFS(int index, int sum) {//더하거나 뺴야할 숫자가 위치한 인덱스와 여태까지의 누적합
		//1.탈출조건
		if(index==numbers.length) {
			if(sum==target) answer++;
			return; 
		}
		//2.수행동작
		DFS(index+1, sum + numbers[index]);
		DFS(index+1, sum - numbers[index]);
	}
    
    public int solution(int[] numbers, int target) {
        answer=0;
		this.numbers = numbers;
		this.target = target;
		
		DFS(0,0);
		
		return answer;
    }
}