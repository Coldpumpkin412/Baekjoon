import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st;
    	StringBuilder sb = new StringBuilder();
    	
    	//테스트케이스 개수 T 입력
    	int T = Integer.parseInt(br.readLine());
    	
    	while(T-->0) {
    		//수첩1에 적은 정수의 개수 N 입력 및 해시셋 선언
    		int N = Integer.parseInt(br.readLine());
    		Set<Integer> memo1 = new HashSet<>();
    		
    		//해시셋에 값들 입력
    		st = new StringTokenizer(br.readLine());
    		for(int i=0 ; i<N ; i++) {
    			memo1.add(Integer.parseInt(st.nextToken()));
    		}
    		
    		//수첩2에 적은 정수의 개수 M 입력
    		int M = Integer.parseInt(br.readLine());
    		
    		//수첩2에 적힌 정수 입력
    		st = new StringTokenizer(br.readLine());
    		for(int i=0 ; i<M ; i++) {
    			//입력값이 memo1배열에서 true라면 1을, 아니라면 0을 저장
    			if(memo1.contains(Integer.parseInt(st.nextToken()))) {
    				sb.append("1\n");
    			}else {
    				sb.append("0\n");
    			}
    		}
    	}
    	
    	System.out.println(sb);
    }
}	
