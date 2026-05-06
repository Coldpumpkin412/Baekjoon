class Solution {
    public int solution(int[][] signals) {
        int length = 1;
        
        for(int i=0 ; i<signals.length ; i++){
            int G = signals[i][0];
            int Y = signals[i][1];
            int R = signals[i][2];
            
            length *= (G + Y + R);
        }
        
        int[] arr = new int[length+1];
        
        for(int i=0 ; i<signals.length ; i++){
            int G = signals[i][0];
            int Y = signals[i][1];
            int R = signals[i][2];
            
            int index = G + Y + R;
            
            for(int j=1 ; j<=length ; j+=index){
                for(int k=0 ; k<Y ; k++){
                    arr[G+j+k]++;
                }   
            }
        }
    
        
        for(int i=1 ; i<=length ; i++){
            if(arr[i] == signals.length){
                return i;
            }
        }
        
        return -1;
    }
}