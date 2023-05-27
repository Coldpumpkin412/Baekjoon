import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		Map<String, Integer> map;
		
		int T = Integer.parseInt(br.readLine());
		
		while(T-->0) {
			String answer = "";
			int max = 0;
			
			int N = Integer.parseInt(br.readLine());
			
			map = new HashMap<>();
			
			while(N-->0) {
				st = new StringTokenizer(br.readLine());
				
				map.put(st.nextToken(), Integer.parseInt(st.nextToken()));
			}
			
			for(String str : map.keySet()) {
				if(max<map.get(str)) {
					max = map.get(str);
					answer = str;
				}
			}
			
			System.out.println(answer);
		}
		
	}
}	