class Solution {
    public int solution(int[] num_list) {
        int multiple = 1;
        int square_sum = 0;
        
        for(int i=0 ; i<num_list.length ; i++){
            multiple *= num_list[i];
            square_sum += num_list[i];
        }
        
        if(multiple<square_sum*square_sum) return 1;
        else return 0;
    }
}