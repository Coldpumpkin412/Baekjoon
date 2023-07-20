import java.util.*;
import java.io.*;

public class Main {
	
    public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st;
    	StringBuilder sb = new StringBuilder();
    	
    	//테스트케이스 개수 입력
    	int T = Integer.parseInt(br.readLine());
    	
    	while(T-->0) {
    		List<String> answer = new ArrayList<>();
    		
    		//카드의 개수 N 입력 및 저장 배열 선언
    		int N = Integer.parseInt(br.readLine());
    		
    		String[] str = new String[N];
    		
    		//알파벳 입력
    		st = new StringTokenizer(br.readLine());
    		for(int i=0 ; i<N ; i++) {
    			str[i] = st.nextToken();
    		}
    		
    		for(int i=0 ; i<N ; i++) {
    			if(i==0) {//첫 알파벳은 그냥 넣어주기
    				answer.add(str[i]);
    			}else if(answer.get(0).charAt(0) >= str[i].charAt(0)) { //가져온값이 리스트 0번째보다 앞순서인경우
    				answer.add(0, str[i]);
    			}else if(answer.get(answer.size()-1).charAt(0) < str[i].charAt(0)) {
    				answer.add(str[i]);
    			}else {
    				answer.add(str[i]);
    			}
    		}
    		
    		//리스트를 스트링으로 변환 후 출력
    		String list = "";
    		for(String val : answer) {
    			list += val;
    		}
    		
    		sb.append(list).append("\n");
    	}
    	
		System.out.println(sb);
    }
}	
