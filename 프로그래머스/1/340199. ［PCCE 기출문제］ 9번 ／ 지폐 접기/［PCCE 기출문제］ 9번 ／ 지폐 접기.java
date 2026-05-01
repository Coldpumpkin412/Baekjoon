class Solution {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0; 
        
        int w = Math.max(wallet[0], wallet[1]);
        int h = Math.min(wallet[0], wallet[1]);

        while (true) {
            if (w >= Math.max(bill[0], bill[1]) &&
                h >= Math.min(bill[0], bill[1])) {
                break;
            }

            if (bill[0] >= bill[1]) {
                bill[0] /= 2;
            } else {
                bill[1] /= 2;
            }
            answer++; 
        }
        
        return answer;
    }
}