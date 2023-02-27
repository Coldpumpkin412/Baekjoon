
import java.util.*;
import java.io.*;

public class Main {
	//각종 연산 결과들을 저장할 set 선언(중복을 배제하기 위해 해시셋으로 선언)
	static Set<Integer> set = new HashSet<>();
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		//수행해야하는 연산의 수(M) 입력
		int M = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		for(int i=0 ; i<M ; i++) {
			st = new StringTokenizer(br.readLine());
			
			String str = st.nextToken();
			if(str.equals("add")) {
				int num = Integer.parseInt(st.nextToken());
				set.add(num);
			}
			if(str.equals("check")) {
				int num = Integer.parseInt(st.nextToken());
				
				if(set.contains(num)) sb.append(1).append("\n");
				else sb.append(0).append("\n");
			}
			if(str.equals("remove")) {
				int num = Integer.parseInt(st.nextToken());
				set.remove(num);
			}
			if(str.equals("toggle")) {
				int num = Integer.parseInt(st.nextToken());
				
				if(set.contains(num)) set.remove(num);
				else set.add(num);
			}
			if(str.equals("all")) {
				set.clear();
				for(int j=1 ; j<=20 ; j++) {
					set.add(j);
				}
			}
			if(str.equals("empty")) {
				set.clear();
			}
		}
		
		System.out.println(sb);
		
	}
}

	
