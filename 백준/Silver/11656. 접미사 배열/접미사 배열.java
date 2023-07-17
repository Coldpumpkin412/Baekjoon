import java.util.*;

public class Main {
    
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//저장용 리스트 선언
		List<String> list = new ArrayList<>();
		
		//단어 S입력
		String S = sc.next();
		
		//접미사들 리스트에 저장
		for(int i=0 ; i<S.length() ; i++) {
			list.add(S.substring(i,S.length()));
		}
		
		//오름차순정렬
		Collections.sort(list);
		
		for(String str : list) {
			System.out.println(str);
		}
    }
}	
