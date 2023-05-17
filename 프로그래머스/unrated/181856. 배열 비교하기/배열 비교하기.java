class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int sum1 = 0;
        int sum2 = 0;
        
        if(arr1.length == arr2.length){
            for(int i=0 ; i<arr1.length ; i++) sum1 += arr1[i];
            for(int i=0 ; i<arr2.length ; i++) sum2 += arr2[i];
            
            if(sum1 == sum2) return 0;
            
            return (sum2 > sum1) ? -1 : 1;
        }else{
            return (arr2.length > arr1.length) ? -1 : 1;
        }
    }
}