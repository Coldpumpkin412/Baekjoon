class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        String[] abs = new String[quiz.length];
           
        for(int i=0 ; i<quiz.length ; i++) {
			abs = quiz[i].split(" ");
			if(abs[1].equals("-")) {
				if(Integer.parseInt(abs[0])-Integer.parseInt(abs[2]) == Integer.parseInt(abs[4])){
					answer[i] = "O";
				} else answer[i] = "X";
			}
			if(abs[1].equals("+")) {
				if(Integer.parseInt(abs[0])+Integer.parseInt(abs[2]) == Integer.parseInt(abs[4])){
					answer[i] = "O";
				} else answer[i] = "X";
			}
			
		}
        return answer;
    }
}