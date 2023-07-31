import java.util.*;
import java.io.*;

public class Main {
	
    public static void main(String[] args) throws IOException{
    	StringBuilder sb = new StringBuilder();
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st;
    	
    	//N, M 입력
    	st = new StringTokenizer(br.readLine());
    	int N = Integer.parseInt(st.nextToken());
    	int M = Integer.parseInt(st.nextToken());
    	
    	List<Integer> list = new ArrayList<>();
    	
    	//배열선언
    	int[] answer = new int[N+M];
    	
    	//배열값 입력
    	st = new StringTokenizer(br.readLine());
    	for(int i=0 ; i<N ; i++) {
    		list.add(Integer.parseInt(st.nextToken()));
    	}
    	
    	st = new StringTokenizer(br.readLine());
    	for(int i=N ; i<M+N ; i++) {
    		list.add(Integer.parseInt(st.nextToken()));
    	}
    	
    	//정렬
    	Collections.sort(list);
    	
    	for(int i=0 ; i<answer.length ; i++) {
    		sb.append(list.get(i)).append(" ");
    	}
    	
    	System.out.println(sb);
    }
}	
