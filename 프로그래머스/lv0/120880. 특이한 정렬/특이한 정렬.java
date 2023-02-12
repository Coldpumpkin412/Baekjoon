class Solution {
    public int[] solution(int[] numlist, int n) {
		for(int i=0 ; i<numlist.length-1 ; i++) {
			for(int j=i+1 ; j<numlist.length ; j++) {
				int tmp=0; 
				if(Math.abs(numlist[i]-n) > Math.abs(numlist[j]-n)) {
					tmp = numlist[i];
					numlist[i] = numlist[j];
					numlist[j] = tmp;
				}else if(Math.abs(numlist[i]-n) == Math.abs(numlist[j]-n)) {
					if(numlist[i] < numlist[j]) {
						tmp = numlist[i];
						numlist[i] = numlist[j];
						numlist[j] = tmp;
					}
				}
			}
		}
        return numlist;
    }
}