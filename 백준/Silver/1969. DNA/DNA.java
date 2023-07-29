import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
	
    public static void main(String[] args) throws IOException{
    	//해시맵 활용하여 풀기
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st;
    	
    	//정답 변수
    	String answer = "";
    	int sum = 0;
    	
    	//DNA의 수(N), 문자열 길이 M 입력
    	st = new StringTokenizer(br.readLine());
    	int N = Integer.parseInt(st.nextToken());
    	int M = Integer.parseInt(st.nextToken());
    	
    	//DNA 저장 배열 선언 및 값 입력
    	String[] DNA = new String[N];
    	for(int i=0 ; i<N ; i++) {
    		DNA[i] = br.readLine();
    	}
    	
    	//입력된 문자열을 한 글자씩 분해하여 해시맵에 넣기
		for(int i=0 ; i<M ; i++) {
			//맵 선언(key : 알파벳, value : 빈도 수)
			Map<Character, Integer> map = new HashMap<>();
			
			for(int j=0 ; j<N ; j++) {
				char ch = DNA[j].charAt(i);
				
				//빈도 수 누적
				map.put(ch, map.getOrDefault(ch, 0)+1);
			}
			
			//빈도수 저장 변수
			int max = 0;
			char value = 'Z';
			for(char key : map.keySet()) {
				//빈도수가 더 많은경우
				if(map.get(key)>max) {
					max = map.get(key);
					
					value = key;
				}else if(map.get(key)==max) {//빈도가 같으면 오름차순 
					value = (char) Math.min(value, key);
				}
			}
			
			answer += value;
		}
    	
    	//answer의 Hamming Distance 출력
		for(int i=0 ; i<N ; i++) {
			for(int j=0 ; j<M ; j++) {
				if(answer.charAt(j) != DNA[i].charAt(j)) {
					sum++;
				}
			}
		}
		
		System.out.println(answer);
		System.out.println(sum);
    }
}	
