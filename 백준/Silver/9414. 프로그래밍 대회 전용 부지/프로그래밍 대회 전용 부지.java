import java.util.*;
import java.io.*;

public class Main {	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st;
    	StringBuilder sb = new StringBuilder();
    	
    	//테스트케이스 개수 T 입력
    	int T = Integer.parseInt(br.readLine());
    	
    	while(T-->0) {
    		//땅 가격 저장 리스트 선언
    		List<Integer> list = new ArrayList<>();
    		
    		//0이 입력될때까지
    		while(true) {
    			
    			//땅 가격 입력
    			int price = Integer.parseInt(br.readLine());
    			
    			//0이 입력된 경우
    			if(price == 0) {
    				//리스트 내림차순 정렬
    				Collections.sort(list, Collections.reverseOrder());
    				
    				//누적 금액 변수
    				int sum = 0;
    				
    				int index = 1;
    				
    				for(int get : list) {
    					sum += 2*Math.pow(get, index++);
    				}
    				    				
    				if(sum > 5000000) {
    					sb.append("Too expensive");
    				}else {
    					sb.append(sum);
    				}
    				
    				sb.append("\n");
    				
    				break;
    			}else { //0이 아닌 가격이 입력된경우
    				list.add(price);
    			}
    		}
    	}
    	
    	System.out.println(sb.toString());
    }
}
