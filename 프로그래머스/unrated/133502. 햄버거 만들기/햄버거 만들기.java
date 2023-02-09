class Solution {
	public int solution(int[] ingredient) {
		int answer=0;
		StringBuilder sb = new StringBuilder();
		
		for(int i : ingredient) {
			sb.append(i); //재료 추가
			//길이가 4이상이고 앞에서부터 4개씩 잘랐을때 1231이면
			if(sb.length()>3 && sb.substring(sb.length()-4, sb.length()).equals("1231")){
				answer++;
				sb.delete(sb.length()-4, sb.length()); //소진된 재료 삭제
			}
		}

		
		return answer;
	}
}