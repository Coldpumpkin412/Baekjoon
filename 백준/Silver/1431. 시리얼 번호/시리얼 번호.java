import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception {
        /*
         * Comparator 활용하여 정렬하기
         */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		
        //리스트 선언
		List<String> list = new ArrayList<>();
		
		for (int i=0 ; i<N ; i++) {
			list.add(br.readLine());
		}
		
        
        //오버라이딩을 통해 정렬 기준 재설정
		Collections.sort(list, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				if(o1.length() == o2.length()) {
					int n1 = sum(o1);
					int n2 = sum(o2);
					if(n1 == n2) return o1.compareTo(o2);
					else return n1 - n2;
				} else {
					return o1.length() - o2.length();
				}
			}
			private int sum(String str) {
				int sum = 0;
				for (int i=0 ; i<str.length() ; i++) {
					int num = str.charAt(i)-'0';
                    
					if(num>=0 && num<=9) {
                        sum += num;
                    }
				}
                
				return sum;
			}
		});
		
        //정답 저장 후 출력
		for (int i=0 ; i<list.size() ; i++) {
			sb.append(list.get(i) + "\n");
		}
		System.out.println(sb);

	}

}