class Solution {
    public int[] solution(int[] arr, int n) {
        //길이가 짝수인 경우
        if(arr.length%2 == 0){
            //홀수 인덱스에 n 더해주기
            for(int i=1 ; i<arr.length ; i+=2){
                arr[i] += n;
            }
        }else{//길이가 홀수인 경우
            //짝수 인덱스에 n 더해주기
            for(int i=0 ; i<arr.length ; i+=2){
                arr[i] += n;
            }
        }
        
        return arr;
    }
}