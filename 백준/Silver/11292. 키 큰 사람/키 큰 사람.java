import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st;
    	StringBuilder sb = new StringBuilder();
    	
    	while(true) {
    		//학생의 수 N 입력
    		int N = Integer.parseInt(br.readLine());
    		
    		//N이 0이라면 루프문 빠져나오기
    		if(N == 0) {
    			break;
    		}
    		
    		//입력 순서를 보장하는 LinkedHashMap 선언(key : 이름, value : 키)
    		Map<String, Double> map = new LinkedHashMap<>();    		

    		//키의 최댓값 초기변수
    		double max = Double.MIN_VALUE;
    		
    		//N이 0이 아니라면
    		while(N-->0) {
        		//학생 이름 및 키 입력
        		st = new StringTokenizer(br.readLine());
        		String name = st.nextToken();
        		Double height = Double.parseDouble(st.nextToken());
        		
        		//키 최댓값 최신화
        		max = Math.max(max, height);
        		
        		//해시맵에 넣기
        		map.put(name, height);
    		}
    		
    		//키의 최댓값(max)와 같은 키를 가진 이름 출력
    		for(String key : map.keySet()) {
    			if(map.get(key) == max) {
    				sb.append(key).append(" ");
    			}
    		}
    		
    		sb.append("\n");
    	}
    	
    	System.out.println(sb.toString());
    }
}	
