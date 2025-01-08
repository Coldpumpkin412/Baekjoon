import java.util.*;
import java.io.*;

public class Main {	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st;
    	StringBuilder sb = new StringBuilder();
    	
    	while(true) {
    		//플레이어1, 플레이어2의 게임내용 입력
    		String P1 = br.readLine();
    		String P2 = br.readLine();
    		
    		//이긴횟수 
    		int P1_count = 0;
    		int P2_count = 0;
    		
    		//둘다 "E"가 나오면 종료
    		if(P1.equals("E") && P2.equals("E")) {
    			break;
    		}
    		
    		for(int i=0 ; i<P1.length() ; i++) {
    			//P1이 이기는경우
    			if((P1.charAt(i)=='R'&&P2.charAt(i)=='S') || (P1.charAt(i)=='S'&&P2.charAt(i)=='P') || (P1.charAt(i)=='P'&&P2.charAt(i)=='R')) {
    				P1_count++;
    			}else if((P2.charAt(i)=='R'&&P1.charAt(i)=='S') || (P2.charAt(i)=='S'&&P1.charAt(i)=='P') || (P2.charAt(i)=='P'&&P1.charAt(i)=='R')) {
    				P2_count++;
    			}
    		}
    		
    		sb.append("P1: ").append(P1_count).append("\n");
    		sb.append("P2: ").append(P2_count).append("\n");
    	}
    	
    	System.out.println(sb.toString());
    }
}
