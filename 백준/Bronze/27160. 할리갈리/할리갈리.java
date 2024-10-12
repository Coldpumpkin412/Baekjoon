import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        
        //카드 개수 N 입력
		int N = Integer.parseInt(br.readLine());
        
        //해시맵 선언(Key : 과일 종류, value : 과일 개수)
		HashMap<String, Integer> map = new HashMap<>();
		while(N-->0) {
            //과일 종류, 개수 입력
            st = new StringTokenizer(br.readLine());
            String S = st.nextToken();
            int num = Integer.parseInt(st.nextToken());
            
			if(map.containsKey(S)) {
				map.put(S, map.get(S)+num);
			}else {
				map.put(S, num);
			}
		}
        
		if(map.containsValue(5)) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
	}
}