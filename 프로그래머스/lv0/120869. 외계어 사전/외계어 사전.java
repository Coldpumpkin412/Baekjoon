class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 0;
        boolean[] check = new boolean[27];
        
		for(int i=0 ; i<dic.length ; i++) {
			check = new boolean[27]; //false로 초기화
			int count=0;
            
			for(int j=0 ; j<spell.length ; j++) {
				check[spell[j].charAt(0)-'a'] = true; //보기에 주어진 알파벳 true로 변경
			}
			for(int k=0; k<dic[i].length() ; k++) {
				check[dic[i].charAt(k)-'a'] = false;
			}
            for(int l=0 ; l<27 ; l++){
                if(check[l] == true) count++;
            }
            
            if(count==0) return 1;
        }
        return 2;
    }
}