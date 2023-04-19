import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		//정렬에 활용할 맵(key : 단어, value : 빈도, 리스트 선언
		Map<String, Integer> map = new HashMap<>();
		List<String> list = new ArrayList<>();
		
		//단어의 개수N, 단어의 길이 기준 M 입력
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		while(N-->0) {
			//단어 입력
			String word = br.readLine();
			
			//단어의 길이가 기준보다 크거나 같다면
			if(word.length() >= M) {
				//맵에 넣어주기(getOrDefault 활용하여 value에 나온 횟수 넣어주기
				map.put(word, map.getOrDefault(word, 0)+1);
			}
		}
		
		//맵에 있는 값들 리스트에 넣어주기
		for(String key : map.keySet()) {
			list.add(key);
		}
		
		//람다식 활용하여 빈도 수, 알파벳 사전순, 단어 길이 등 비교
		//"음수 혹은 0를 리턴하는 경우 자리 유지, 양수를 리턴하는 경우 자리 바꿈"
		list.sort((o1, o2) -> {
			int value1 = map.get(o1);
			int value2 = map.get(o2);
			
			//빈도수가 같은경우
			if(value1 == value2) {
				//단어의 길이또한 같은경우
				if(o1.length() == o2.length()) {
					//알파벳 사전순으로 정렬
					return o1.compareTo(o2);
				}
				
				//단어의 길이가 길수록 앞에
				return o2.length()-o1.length();
			}
			
			//단어 빈도수가 클 수록
			return value2 - value1;
		});
		
        //시간초과방지를 위해 StringBuilder 사용
		StringBuilder sb = new StringBuilder();
		for(int i=0 ; i<list.size() ; i++) {
			sb.append(list.get(i)).append("\n");
		}
		
		System.out.println(sb);
	}
}

	
