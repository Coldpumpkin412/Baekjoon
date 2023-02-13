class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        
        int mid_Num = total/num; //가운데 숫자 정의
        int sub_Num = (total%num==0) ? (num/2) : (num/2-1); //시작숫자를 구하는데 필요한 변수
        int first_Num = mid_Num-sub_Num;
        
        for(int i=0 ; i<num ; i++) answer[i] = first_Num+i;
        return answer;
    }
}