import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		//활용할 해시맵 선언 및 'ChongChong' 초기값 입력
		Map<String, Boolean> map = new HashMap<>();
		map.put("ChongChong", true);
		
		//기록의 수 N 입력
		int N = Integer.parseInt(br.readLine());
		
		while(N-->0) {
			//기록 입력
			st = new StringTokenizer(br.readLine());
			
			String A = st.nextToken();
			String B = st.nextToken();
			
			//System.out.println(A +" "+ B);
			//춤을추고있는사람을 만났다면 모두 true로 업데이트
			if((map.containsKey(A) && map.get(A)) || (map.containsKey(B) && map.get(B))) {
				map.put(A, true);
				map.put(B, true);
			}
		}
		
		//맵의 크기가 춤을추고 있는 사람의 수
		System.out.println(map.size());
	}
}

	
