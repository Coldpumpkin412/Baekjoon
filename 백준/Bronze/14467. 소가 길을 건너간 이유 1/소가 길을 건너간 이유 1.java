import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st;
    	
    	//관찰횟수 N 입력
    	int N = Integer.parseInt(br.readLine());
    	
    	//해시맵 선언(key : 소 번호, value : 현위치)
    	Map<Integer, Integer> map = new HashMap<>();
    	
    	int count = 0;
    	
    	while(N-->0) {
    		//소의 번호 및 위치 입력
    		st = new StringTokenizer(br.readLine());
    		int cow = Integer.parseInt(st.nextToken());
    		int point = Integer.parseInt(st.nextToken());
    		
    		//처음 관찰되는 소의 번호인경우
    		if(!map.containsKey(cow)) {
    			//해시맵에 넣어주기
    			map.put(cow, point);
    			continue;
    		}
    		
    		//관찰한적이 있는 소의 번호라면 기존 위치와 현 위치 비교
    		//위치가 다르다면 변경 후 count 증가
    		if(map.get(cow) != point) {
    			map.put(cow, point);
    			count++;
    		}
    		
    	}
    	
    	System.out.println(count);
    }
}	
