import java.util.*;
import java.io.*;
 
public class Main {
    public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st;	
        
        //땅 개수 N, 오리 수 Q 입력
    	st = new StringTokenizer(br.readLine()); 
    	int N = Integer.parseInt(st.nextToken());
    	int Q = Integer.parseInt(st.nextToken());
        
    	boolean[] visited = new boolean[N+1];
    	
    	while(Q-->0) {
            
            //오리가 원하는 땅 번호
    		int x = Integer.parseInt(br.readLine());
    		boolean check = false;
            
    		int index = 1;
            
    		for(int i=x ; i>=2 ; i/=2) {
    			if(visited[i]) {
    				check = true;
    			    index = i;
    			}
    		}
    		
    		if(check) { 
    			System.out.println(index);
    		}else if(!check) {
    			visited[x] = true;
                
    			System.out.println("0");
    		}
    		
    	}
    } 
}