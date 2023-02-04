class Solution {
    public String solution(int[] food) {
        String answer = "";
        String reverse = "";
        
		for(int i=1 ; i<food.length ; i++) {
			if(food[i]==1) continue;
			else {
				for(int j=0 ; j<food[i]/2 ; j++) answer += Integer.toString(i);
			}
		}
		answer += "0";
		
		for(int i=answer.length()-2 ; i>=0 ; i--) reverse += answer.charAt(i);
		
		answer += reverse;
		
        return answer;
    }
}