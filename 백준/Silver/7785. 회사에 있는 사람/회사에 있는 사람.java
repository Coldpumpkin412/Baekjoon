import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		Map<String, String> log = new HashMap<>();
		
		//로그에 기록된 출입기록의 수 N 입력
		int N = Integer.parseInt(br.readLine());
		
		//출입기록 N번 입력
		while(N-->0) {
			st = new StringTokenizer(br.readLine());
			String name = st.nextToken();
			String record = st.nextToken();
			
			//해시맵 업데이트(key : 이름, value : 출최근여부)
			log.put(name, record);
		}
		
		//value가 출근인 key들 리스트에 넣기
		List<String> list = new ArrayList<>();
		for(String key : log.keySet()) {
			if(log.get(key).equals("enter")) {
				list.add(key);
			}
		}
		//역순으로 출력
		Collections.sort(list, Collections.reverseOrder());
		
		//출력
		for(int i=0 ; i<list.size() ; i++) {
			System.out.println(list.get(i));
		}
	}
}

	
