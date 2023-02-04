import java.util.*;

class Solution {
    public int solution(int[] nums) {
        Integer[] arr = new Integer[nums.length];
        for(int i=0 ; i<arr.length ; i++) arr[i] = nums[i];
        
        
		Set<Integer> set = new HashSet<Integer>(Arrays.asList(arr));
        
        if(set.size()>=nums.length/2) return nums.length/2;
        else return set.size();

    }
}