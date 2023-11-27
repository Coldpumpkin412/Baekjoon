import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st;
    	
    	/*
    	 * 온기 및 수분 모두 0 밑으로는 떨어지지 않기 때문에 
    	 * 필요온기(X), 필요수분(Y) 중 더 큰 값을 먼저 다 채운 후
    	 * 더 작은 값을 마저 채워주고 그 동안 감소된 온기or수분 값을 채워준다.
    	 * 
    	 * ex) X>Y 인경우 X + Y + Y/10 (10번마다 1씩 감소하므로)
    	 */
    	
    	//필요한 온기 X, 필요한 수분 Y 입력
    	st = new StringTokenizer(br.readLine());
    	int X = Integer.parseInt(st.nextToken());
    	int Y = Integer.parseInt(st.nextToken());
    	
    	//더 큰 값, 작은 값 확인(같은경우는 상관없음)
    	int max = Math.max(X, Y);
    	int min = Math.min(X, Y);
    	
    	System.out.println(max + min + min/10);
    	
    }
}	
