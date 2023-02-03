import java.util.*;

class Solution {
    public int solution(String str1, String str2) {
        ArrayList<String> list_str1 = new ArrayList<>();
		ArrayList<String> list_str2 = new ArrayList<>();
		ArrayList<String> intersection = new ArrayList<>();
		int union=0; //합집합의 원소 개수
		
		//주어진 문자열을 두 글자씩 끊은 후 조건확인(알파벳 이외 글자인지)
		for(int i=0 ; i<str1.length()-1 ; i++) {
			String s = str1.substring(i,i+2);
			s = s.toUpperCase();
			
			if(s.matches("^[A-Z]*$")) { //조건에 맞는 경우 각각의 리스트에 추가
				list_str1.add(s);
			}
		}
		for(int i=0 ; i<str2.length()-1 ; i++) {
			String s = str2.substring(i,i+2);
			s = s.toUpperCase(); 
			
			if(s.matches("^[A-Z]*$")) { //조건에 맞는 경우 각각의 리스트에 추가
				list_str2.add(s);
			}
		}
		
		union = list_str1.size() + list_str2.size(); 
		
		//양쪽 다 리스트가 비어있는 경우 return 65536
		if(list_str1.isEmpty() && list_str2.isEmpty()) return 65536;
		
		//원소 비교 후 교집합 구하기
		for(String inter : list_str1) {
			if(list_str2.remove(inter)) { //2번 문자열에도 존재할경우 해당 문자열에서 제거 후
				intersection.add(inter); //교집합 리스트에 추가
			}
		}
		
		//합집합 원소 개수 : 각 두 개의 리스트 원소의 개수 더한 후 교집합 리스트 개수 제거
		return (intersection.size()*65536) /(union - intersection.size());
    }
}