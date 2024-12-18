import java.util.*;
import java.io.*;

public class Main {
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st;
    	
    	//라운드 개수 N 입력
    	int N = Integer.parseInt(br.readLine());
    	
    	//A, B 이긴횟수 변수
    	int A_win = 0;
    	int B_win = 0;
    	
    	while(N-->0) {
    		//A, B 각각 점수
    		st = new StringTokenizer(br.readLine());
    		int A = Integer.parseInt(st.nextToken());
    		int B = Integer.parseInt(st.nextToken());
    			
    		//비긴 경우 주의
    		if(A > B) {
    			A_win++;
    		}else if(B > A) {
    			B_win++;
    		}
    	}
    	System.out.println(A_win + " " + B_win);
    }
}
