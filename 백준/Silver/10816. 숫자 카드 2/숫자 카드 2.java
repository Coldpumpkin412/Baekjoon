import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		
		Map<String, Integer> map = new HashMap<>();
		
		//상근이가 가지고 있는 숫자카드의 개수 입력
		int N = Integer.parseInt(br.readLine());
		
		//숫자카드에 적혀있는 정수 입력 후 해시맵에 저장(key : 숫자, value : 빈도)
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		for(int i=0 ; i<N ; i++) {
			String number = st.nextToken();
			map.put(number, map.getOrDefault(number, 0)+1);
		}
		
		//M입력
		int M = Integer.parseInt(br.readLine());
		
		
		StringTokenizer tk = new StringTokenizer(br.readLine()," ");
		//해당 숫자를 key로 갖는 value(빈도)를 정답 배열에 저장
		for(int i=0 ; i<M ; i++) {
			String number = tk.nextToken();
			if(map.get(number)==null) { //널값이라면 0을 저장
				sb.append(0 + " ");
			}else {
				sb.append(map.get(number)+" "); 
			}
		}
		
		System.out.println(sb.toString());
	}
}

	
