import java.util.*;
import java.io.*;

public class Main {	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st;
    	StringBuilder sb = new StringBuilder();
    	//가희가 메모장에 적은 키워드 개수 N, 블로그에 쓴 글의 개수 M 입력
    	st = new StringTokenizer(br.readLine());
    	int N = Integer.parseInt(st.nextToken());
    	int M = Integer.parseInt(st.nextToken());
    	
    	//HashSet 선언
    	Set<String> keyword = new HashSet<>();
    	
    	//메모장에 적은 키워드 set에 저장
    	while(N-->0) {
    		keyword.add(br.readLine());
    	}
    	
    	//가희가 쓴 글 관련 키워드 입력
    	while(M-->0) {
    		String str = br.readLine();
    		
    		//키워드 , 기준 분할
    		String[] word = str.split(",");
    		
    		//키워드가 해시셋에 있는경우 제거
    		for(int i=0 ; i<word.length ; i++) {
    			if(keyword.contains(word[i])) {
    				keyword.remove(word[i]);
    			}
    		}
    		
    		//남은 키워드 개수 저장
    		sb.append(keyword.size()).append("\n");
    	}
    	
    	System.out.println(sb.toString());
    }
}	
