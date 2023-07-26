import java.util.*;
import java.io.*;


public class Main {
	
    public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	//해시맵 생성(key : 숫자, value : 빈도)
    	Map<Long, Integer> map = new HashMap<>();
    	
    	//카드의 개수 N 입력
    	int N = Integer.parseInt(br.readLine());
    	
    	int key = 0;
    	long answer = 0;
        
    	while(N-->0) {
    		//숫자입력
    		long num = Long.parseLong(br.readLine());
    		
    		//해시맵에 저장 및 빈도 수 최신화(처음들어온 수는 default값으로 0을 넣고 이후로는 누적값으로 +1)
    		map.put(num, map.getOrDefault(num, 0)+1);
    		
    		//빈도가 큰 값을 바로 최신화 후 키 값도 바꿔주기
    		if(map.get(num)>key) {
    			key = map.get(num);
    			answer = num;
    		}else if(map.get(num)==key) {
    			answer = Math.min(num, answer);
    		}
    	}
    	
    	System.out.println(answer);
    }
}	
