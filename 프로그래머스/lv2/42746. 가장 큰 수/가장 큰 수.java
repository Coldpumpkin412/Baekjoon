import java.util.*;

class Solution {
    public String solution(int[] numbers) {
       StringBuilder sb = new StringBuilder();
		
		//주어진 numbers 배열을 문자열로 변환하여 저장할 배열 선언
		String[] num = new String[numbers.length];
		
		//numbers 배열 값들 변환하여 넣어주기
		for(int i=0 ; i<num.length ; i++) {
			num[i] = Integer.toString(numbers[i]);
		}
		
		//내림차순으로 정렬해주기
		//이때 문자열로 변환된 숫자들을 앞뒤로 붙인 값중 더 큰값을 기준으로 정렬
		Arrays.sort(num, (o1, o2)->(o2+o1).compareTo(o1+o2));
		
		//내림차순 정렬 후 맨 첫 원소가 0 이라면 0을 출력하고 종료
		if(num[0].equals("0")) {
			return "0";
		}
		
		//정렬이후 값들 저장
		for(String str : num) {
			sb.append(str);
		}
		
		return sb.toString();
    }
}