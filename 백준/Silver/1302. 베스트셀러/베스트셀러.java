import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		/*
		 * 빈도수를 저장하기 위한 트리맵 선언.(key : 책제목, value : 팔린 수)
		 * 가장 팔린 책의 개수가 같은경우 사전순으로 앞에있는 제목을 출력해야하기 때문에,
		 * 자동적으로 정렬되는 트리맵을 선언한다
		 */
		String answer="";
		
		Map<String, Integer> book = new TreeMap<>();
		
		//팔린 책의 수 N 입력
		int N = Integer.parseInt(br.readLine());
		
		//팔린 책 입력
		while(N-->0) {
			//입력과 동시에 트리맵에 빈도수 저장
			String name = br.readLine();
			
			//처음 등장(default)라면 0을, 아니라면 .get(name) 값에 대한 +1을
			book.put(name, book.getOrDefault(name, 0)+1);
		}
		
		//책이 나온 빈도수 확인변수 초기화
		int max=0;
		
		//키셋을 활용하여 빈도 수 확인 및 갱신
		for(String str : book.keySet()) {
			//더 많이 팔린 책이 있다면 정답 갱신
			if(book.get(str) > max) {
				max = book.get(str);
				answer = str;
			}
		}
		
		System.out.println(answer);
	}
}

	
