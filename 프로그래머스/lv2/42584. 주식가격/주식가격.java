class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
		
		for(int i=0 ; i<prices.length ; i++) {
			answer[i] = 0; //0으로 값을 초기화
			
			for(int j=i+1 ; j<prices.length ; j++) {
				answer[i]++; //1초씩 늘어나므로 증가
				
				if(prices[i] > prices[j]) break; //가격이 떨어진 순간 빠져나오기
			}
		}
		return answer;
    }
}