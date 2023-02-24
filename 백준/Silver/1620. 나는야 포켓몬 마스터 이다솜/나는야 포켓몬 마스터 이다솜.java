import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		Map<String, Integer> pokemon = new HashMap<>();
		
		//첫째줄: 도감에 포켓몬의 개수(N), 맞춰야하는 문제의 개수(M) 입력
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		//포켓몬 따로 저장할 배열 선언
		String[] arr = new String[N+1];
		
		//포켓몬의 이름 N번 입력. 입력마다 해시맵에 저장(Key : 입력되는 포켓몬의 이름, Value : 1부터 하나씩 증가)
		for(int i=0 ; i<N ; i++) {
			String str = br.readLine();
			pokemon.put(str, (i+1));
			arr[i+1] = str;
		}
		
		//맞춰야하는 문제 M번 입력. 
		for(int i=0 ; i<M ; i++) {
			String str = br.readLine();
			
			//포켓몬 이름이 입력된경우
			if(pokemon.containsKey(str)) {
				sb.append(pokemon.get(str)).append("\n");
			}else {//숫자가 입력된경우 배열의 인덱스를 활용하기
				sb.append(arr[Integer.parseInt(str)]).append("\n");
			}
		}
		//정답출력
		System.out.println(sb);
		
	}
}

	
