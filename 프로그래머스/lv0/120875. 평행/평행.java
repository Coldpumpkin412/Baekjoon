class Solution {
    public int solution(int[][] dots) {
        
        int[] first = dots[0];
        int[] second = dots[1];
        int[] third = dots[2];
        int[] fourth = dots[3];

        if((parallel(first, second) == parallel(third, fourth))||
           (parallel(first, third) == parallel(second, fourth))||
           (parallel(first, fourth) == parallel(second, third))){
            return 1;
        }

        return 0;
    }
    
	public static double parallel(int[] first, int[] second) {
		double y_slope = first[1]-second[1];
		double x_slope = first[0]-second[0];
		
		return y_slope/x_slope;
	}
}