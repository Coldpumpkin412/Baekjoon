import java.util.*;

class Solution {
	public int[] solution(String today, String[] terms, String[] privacies) {
		List<Integer> answer=new ArrayList<>();
		HashMap<String, Integer> standard = new HashMap<>();
		
		//오늘 날짜
		String[] t = today.split("\\."); //점을 기준으로 분해
		int tCount = Integer.parseInt(t[0])*12*28 + Integer.parseInt(t[1])*28 + Integer.parseInt(t[2]);
		
		for(String i : terms) {
			String[] arr = i.split(" ");
			standard.put(arr[0], Integer.parseInt(arr[1]));
		}
		
		for(int i=0 ; i<privacies.length ; i++) {
			int year = Integer.parseInt(privacies[i].substring(0,4)); //연도
			int month = Integer.parseInt(privacies[i].substring(5,7)); //월
			int day = Integer.parseInt(privacies[i].substring(8,10)); //일
			
			String type = privacies[i].substring(11,12); //약관종류
			
			int tp = standard.get(type); //해시맵에서 약관종류의 유효기간 가져오기
			
			month += tp;
			
			Integer tmp = year*12*28 + month*28 + day -1; //유효기간 마지노선
			
			if(tCount > tmp) answer.add(i+1);
		}
		
		return answer.stream().mapToInt(i -> i).toArray(); //Integer리스트 int배열로 변환
	}

	
}