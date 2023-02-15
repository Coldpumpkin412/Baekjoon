import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine()); //단어의 개수 입력
		
		//해시셋 활용하여 중복 제거
		Set<String> set = new HashSet<>();
		for(int i=0 ; i<N ; i++) set.add(br.readLine());
		
		//중복제거된 set을 answer배열에 넣기(Iterator활용)
		String[] answer = new String[set.size()];
		
		Iterator it = set.iterator();
		for(int i=0 ; i<set.size() ; i++) answer[i] = (String) it.next();
		
		//람다식 활용하여 정렬
		Arrays.sort(answer, new Comparator<String>() {
			public int compare(String str1, String str2) {
				if(str1.length() == str2.length()) { //단어의 길이가 같은경우
					return str1.compareTo(str2);
				}else {//단어의 길이가 다른경우
					return str1.length() - str2.length();
				}
			}
		});
		
        //정답 출력
		for(int i=0 ; i<answer.length ; i++) System.out.println(answer[i]);
	}
}