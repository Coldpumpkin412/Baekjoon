import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st;
    	
    	//신청횟수 N 및 게임종류 입력
    	st = new StringTokenizer(br.readLine());
    	int N = Integer.parseInt(st.nextToken());
    	String str = st.nextToken();
    	
    	//같이 플레이하는 사람들 입력(중복 불가)
    	Set<String> set = new HashSet<>();
    	while(N-->0) {
    		set.add(br.readLine());
    	}
    	
    	//게임에 따라 필요인원이 다름(Y : 1명, F : 2명, O : 3명)
    	switch(str) {
    		case "Y" : System.out.println(set.size()); break;
    		case "F" : System.out.println(set.size()/2); break;
    		case "O" : System.out.println(set.size()/3); break;
    	}
    }
}	
