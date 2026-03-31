import java.util.*;
import java.io.*;

public class Main{	
    
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringBuilder sb = new StringBuilder();
    	
    	//테스트케이스 개수 N 입력
    	int N = Integer.parseInt(br.readLine());
    	
    	while(N-->0) {
    		//이름 입력
    		String name = br.readLine();
    		
    		//출력에 저장
    		sb.append(name).append(" is ");
    		
    		//대문자로 변환
    		name = name.toUpperCase();
    		
    		//문자 배열로 변환
    		char[] ch = name.toCharArray();
        	
        	//G의 개수 변수, B의 개수 변수 선언	
    		int G_count = 0;
    		int B_count = 0;
    		
    		//각 문자별로 G, B 개수 갱신
    		for(int i=0 ; i<ch.length ; i++) {
    			if(ch[i] == 'G') {
    				G_count++;
    			}
    			
    			if(ch[i] == 'B') {
    				B_count++;
    			}
    		}
    		
    		if(G_count > B_count) {
    			sb.append("GOOD").append("\n");
    		}else if(G_count < B_count) {
    			sb.append("A BADDY").append("\n");
    		}else {
    			sb.append("NEUTRAL").append("\n");
    		}
    	}
    	
    	//출력
    	System.out.print(sb.toString());
    }
}
