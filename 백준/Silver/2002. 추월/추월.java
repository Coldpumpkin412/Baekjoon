import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	//차량의 개수 N 입력
    	int N = Integer.parseInt(br.readLine());
    	
    	//터널에 들어가는 차량 순서 관련 해시맵 선언(key : 차량 번호, value : 등수)
    	Map<String, Integer> map = new HashMap<>();
    	
    	//차량 번호 입력
    	for(int i=1 ; i<=N ; i++) {
    		map.put(br.readLine(), i);
    	}
    	
    	//나오는 차량을 순서대로 저장할
    	int[] rank = new int[N+1];
    	
    	for(int i=1 ; i<=N ; i++) {
    		rank[i] = map.get(br.readLine());
    	}
    	
    	int count = 0;
    	
    	//배열값을 비교하여 낲에 더 큰 수가 있다면 추월한 것
    	for(int i=1 ; i<N ; i++) {
    		for(int j=i+1 ; j<=N ; j++) {
    			if(rank[i] > rank[j]) {
    				count++;
    				break;
    			}
    		}
    	}
    	
    	System.out.println(count);
    }
}	
