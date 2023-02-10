class Solution {
    public int[] solution(int[][] score) {
        double[] avg = new double[score.length]; //평균값 저장을 위해 double로 변경
        int[] answer = new int[score.length];
        
        for(int i=0 ; i<avg.length ; i++) avg[i] = (double)(score[i][0]+score[i][1])/2;
        
        for(int i=0 ; i<avg.length ; i++){
            answer[i]=1; //순위 초기화
            for(int j=0 ; j<avg.length ; j++){
                if(avg[i]<avg[j]) answer[i]++; //본인보다 큰 점수가 있으면 순위++
            }
        }

        return answer;
    }
}