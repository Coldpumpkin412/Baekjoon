import java.util.*;

class Solution {
    //멤버변수
    Position left;
    Position right;
    Position numPos; //숫자의 위치
    
    class Position {
        int row; 
        int col;
        
        //생성자(초기화)
        Position(int row, int col){
            this.row = row;
            this.col = col;
        }
        
        //숫자에 따라 누를 손가락 정하는 함수
        public String getFinger(String hand){
            //주 손을 초기값으로 설정
            String finger = hand.equals("right") ? "R" : "L";
            //col이 0이면 무조건 왼손, 2면 무조건 R
            if(this.col==0) finger = "L";
            else if(this.col==2) finger = "R";
            else{//col이 1이면 거리 계산후 finger 선정
                //왼손 및 오른손까지 해당 숫자의 거리
                int leftD = left.getDistance(this); 
                int rightD = right.getDistance(this);
                
                if(leftD<rightD) finger = "L";
                else if(rightD<leftD) finger = "R";
            }
            
            //leftD와 rightD가 같다면 주 손을 리턴
            return finger;
        }
        //손가락과 숫자까지의 거리
        public int getDistance(Position p){
            return Math.abs(this.row-p.row) + Math.abs(this.col - p.col);
        }
    }
    public String solution(int[] numbers, String hand) {
        String answer = "";
        /*키패드는 배열로 관리
         *      0       1       2
         *  0   1       2       3
         *  1   4       5       6
         *  2   7       8       9
         *  3   *(L)    0       #(R)
         */
        
        //1.왼손과 오른손 초기 위치 설정
        left = new Position(3,0);
        right = new Position(3,2);
        
        //numbers 배열에서 한글자씩 꺼내오기
        for(int num : numbers){
            //숫자의 위치 배열로 확인(숫자가 0일경우만 예외적으로 선언)
            numPos = new Position((num-1)/3, (num-1)%3);
            if(num==0) numPos = new Position(3,1);
            //2.숫자를 누를 손가락 정하기
            String finger = numPos.getFinger(hand);
            
            //3. 정해진 손가락 answer에 담고 손가락 위치 이동
            answer += finger;
            if(finger.equals("L")) left = numPos;
            else right = numPos;
        }
        return answer;
    }
    
    public static void main(String[] args) {
		Solution sol = new Solution();
		int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
		String hand = "right";
		System.out.println(sol.solution(numbers, hand));

	}
}