class Solution {
    public int solution(int[] array) {
        int[] count = new int[1000]; //빈도수 저장 배열
        int answer=0;
        int n=0;
        int max=0;
        
        for(int i=0 ; i<array.length ; i++){
            count[array[i]]++;
        }
        for(int i=0 ; i<count.length ; i++){
            if(max<count[i]){
                max = count[i];
                answer = i;
            }
        }
        for(int i=0 ; i<count.length ; i++){
            if(count[i] == max) n++;
        }
        
        if(n>1) return -1;
        
        return answer;
    }
}