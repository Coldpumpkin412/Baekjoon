class Solution {
    public String solution(String code) {
        String ret = "";
		
		//모드 초기값
		int mode = 0;
		
		int length = code.length();
		
		for(int i=0 ; i<length ; i++) {
			if(mode == 0) {
				if(code.charAt(i) != '1') {
					if(i%2==0) ret += code.charAt(i);
				}else if(code.charAt(i) == '1'){
					mode = 1;
				}
			}else if(mode == 1) {
				if(code.charAt(i) != '1') {
					if(i%2==1) ret += code.charAt(i);
				}else if(code.charAt(i) == '1'){
					mode = 0;
				}
			}
		}
		
		if(ret.isEmpty()) return "EMPTY";
		else return ret;
    }
}