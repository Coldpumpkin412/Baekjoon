import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		//비밀번호 관리하는 해시맵 선업(key : 사이트주소, value : 비밀번호)
		Map<String, String> password = new HashMap<>();
		
		//첫째 줄에 저장된 사이트의 주소의 수(N), 비밀번호를 찾고자 하는 사이트 주소의 수(M) 입력
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		for(int i=0 ; i<N ; i++) {
			st = new StringTokenizer(br.readLine());
			
			String id = st.nextToken();
			String pwd = st.nextToken();
			
			password.put(id, pwd);
		}
		
		for(int i=0 ; i<M ; i++) {
			//찾고자하는 비밀번호의 주소 입력
			String str = br.readLine();
			
			//해당 주소를 key로 갖는 value 출력
			System.out.println(password.get(str));
		}
	}
}

	
