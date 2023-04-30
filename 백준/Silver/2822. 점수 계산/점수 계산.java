import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		Map<Integer, Integer> map = new HashMap<>();
		
		//8문제에 대한 점수 입력 후 해시맵에 저장(key : 점수, value : 문제번호
		for(int i=1 ; i<=8 ; i++) {
			map.put(Integer.parseInt(br.readLine()), i);
		}
		
		//해시맵을 점수(key) 기준으로 내림차순 정렬(리스트 활용)
		List<Integer> keySet = new ArrayList<>(map.keySet());
		
		keySet.sort(Collections.reverseOrder());
		
		//가장높은 5개의 점수 합 출력 및 문제번호 저장
		int sum = 0;
		List<Integer> number = new ArrayList<>();
		for(int i=0 ; i<5 ; i++) {
			sum += keySet.get(i);
			
			number.add(map.get(keySet.get(i)));
		}
		
		//문제번호 오름차순 정렬
		Collections.sort(number);
		
		System.out.println(sum);
		
		for(int i=0 ; i<5 ; i++) {
			System.out.print(number.get(i)+" ");
		}
				
	}
}

	
