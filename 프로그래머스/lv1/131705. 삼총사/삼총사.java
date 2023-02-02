class Solution {
    public int solution(int[] number) {
        int answer = 0;
        
        //삼중 반복문을 활용하여 3개의 원소 추출
        for(int i=0 ; i<number.length-2 ; i++){
            for(int j=i+1 ; j<number.length-1 ; j++){
                for(int k=j+1 ; k<number.length ; k++){
                    //3개의 원소 합이 0일 경우 answer+1
                    if(number[i] + number[j] + number[k] == 0) answer++;
                }
            }
        }
        
        return answer;
    }
}