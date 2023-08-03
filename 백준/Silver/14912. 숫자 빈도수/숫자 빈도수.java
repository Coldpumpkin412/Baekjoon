import java.util.*;
import java.io.*;

public class Main {
	
    public static void main(String[] args) throws IOException{
    	//해시맵 활용
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st;
    	
    	//해시맵 선언(key : 숫자, value : 빈도)
    	Map<Character, Integer> map = new HashMap<>();
    	
    	//자연수 N 및 d 입력
    	st = new StringTokenizer(br.readLine());
    	int N = Integer.parseInt(st.nextToken());
    	int d = Integer.parseInt(st.nextToken());
    	
    	for(int i=1 ; i<=N ; i++) {
    		//i를 문자열로 변형 후 한 글자씩 분해
    		String str = Integer.toString(i);
    		
    		char[] ch = str.toCharArray();
    		
    		//분해된 문자 빈도수 최신화
    		for(char num : ch) {
    			map.put(num, map.getOrDefault(num, 0)+1);
    		}
    	}
    	
    	System.out.println(map.get(Character.forDigit(d, 10)));
    }
}	
