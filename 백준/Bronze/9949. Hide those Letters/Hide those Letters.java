import java.util.*;
import java.io.*;

public class Main {
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringBuilder sb = new StringBuilder();
    	StringTokenizer st;
    	
    	int index = 1;
    	
    	while(true) {
    		
    		//두 문자 입력
    		st = new StringTokenizer(br.readLine());
    		String input1 = st.nextToken();
    		String input2 = st.nextToken();
    		
    		if(input1.equals("#") && input2.equals("#")) {
    			break;
    		}
    		
    		sb.append("Case ").append(index).append("\n");
    		
    		//텍스트 줄 수 N 입력
    		int N = Integer.parseInt(br.readLine());
    		
    		for(int i=1 ; i<=N ; i++) {
    			String str = br.readLine();
    			
    			str = str.replace(input1.toUpperCase(), "_").replace(input1.toLowerCase(), "_")
    					.replace(input2.toUpperCase(), "_").replace(input2.toLowerCase(), "_");
    			
    			sb.append(str).append("\n");
    		}
    		
    		sb.append("\n");
    		
    		index++;
    	}
    	
    	System.out.println(sb.toString());
    }
}
