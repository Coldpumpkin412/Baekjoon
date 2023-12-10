import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        
        //노래의 길이 N, 구간의 수 Q 입력
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int Q = Integer.parseInt(st.nextToken());
        
        //박자의 빠르기 저장 배열 선언 및 값 입력
        int[] song = new int[N];
        
        st = new StringTokenizer(br.readLine());
        for(int i=0 ; i<N ; i++) {
        	song[i] = Integer.parseInt(st.nextToken());
        }
        //구간의 수 만큼
        while(Q-->0) {
        	int sum = 0;
        	
        	//구간 시작점 및 끝점 입력
        	st = new StringTokenizer(br.readLine());
        	int start = Integer.parseInt(st.nextToken());
        	int end = Integer.parseInt(st.nextToken());
        	
        	if(start == end) {
        		sb.append(0).append("\n");
        		continue;
        	}
        	
        	for(int i=start ; i<end ; i++) {
        		sum += Math.abs(song[i]-song[i-1]);
        	}
        	
        	sb.append(sum).append("\n");
        }
        
        System.out.println(sb.toString());
    }
}	
