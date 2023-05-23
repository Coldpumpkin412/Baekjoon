import java.util.*;

class Solution {
    public int solution(int[] arr) {
		int answer = 0;
        int[] comp = new int[arr.length];
        
        for(int i=0 ; i<arr.length ; i++){
            if(arr[i]>=50 && arr[i]%2==0){
                comp[i] = arr[i]/2;
            }else if(arr[i]<50 && arr[i]%2==1){
                comp[i] = arr[i]*2 + 1;
            }else{
                comp[i] = arr[i];
            }
        }
        
      
        while(true){
            if(Arrays.equals(arr, comp)) {
            	break;
            }else {
            	for(int i=0 ; i<comp.length ; i++) {
            		arr[i] = comp[i];
            	}
            	
            	for(int i=0 ; i<arr.length ; i++){
                    if(arr[i]>=50 && arr[i]%2==0){
                        comp[i] = arr[i]/2;
                    }else if(arr[i]<50 && arr[i]%2==1){
                        comp[i] = arr[i]*2 + 1;
                    }else{
                        comp[i] = arr[i];
                    }
                }
            }
            answer++;
        }
        
        return answer;
    }
}