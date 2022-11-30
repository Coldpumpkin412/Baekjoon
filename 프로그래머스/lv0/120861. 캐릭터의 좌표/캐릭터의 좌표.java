class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = {0,0};
        int x_min = -(board[0]-1)/2;
        int x_max = (board[0]-1)/2;
        int y_min = -(board[1]-1)/2;
        int y_max = (board[1]-1)/2;
        
        
        for(int i=0 ; i<keyinput.length ; i++){
            String insult = keyinput[i];
            
            if(insult.equals("left") && answer[0] != x_min){
                answer[0] -= 1;
            }
            else if(insult.equals("right") && answer[0] != x_max){
                answer[0] += 1;
            }
            else if(insult.equals("up") && answer[1] != y_max){
                answer[1] += 1;
            }
            else if(insult.equals("down") && answer[1] != y_min){
                answer[1] -= 1;
            }
        }

            return answer;
    }
}