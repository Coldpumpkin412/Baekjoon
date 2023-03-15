import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		Map<String, Integer> map = new HashMap<>();
		
		//N과 M입력
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		//N번 문자열 입력 후 해시맵에 저장
		for(int i=0 ; i<N ; i++) {
			String str = br.readLine();
			
			map.put(str, 0);
		}
		
		//M번 문자열 입력
		int count = 0;
		for(int i=0 ; i<M ; i++) {
			String str = br.readLine();
			
			//입력된 문자열이 map에 키로 존재한다면 중복되는 것이므로 count++
			if(map.containsKey(str)) count++;
		}
		
		System.out.println(count);
	}
}

	
