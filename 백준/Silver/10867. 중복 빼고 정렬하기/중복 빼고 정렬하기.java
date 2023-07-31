import java.util.*;
import java.io.*;

public class Main {
	
    public static void main(String[] args) throws IOException{
    	/*
    	 * 중복을 허용하지않으므로 해시셋 활용
    	 */    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st;
    	StringBuilder sb = new StringBuilder();
    	
    	Set<Integer> set = new HashSet<>();
    	List<Integer> list = new ArrayList<>();
    	
    	//N입력
    	int N = Integer.parseInt(br.readLine());
    	
    	st = new StringTokenizer(br.readLine());
    	while(N-->0) {
    		set.add(Integer.parseInt(st.nextToken()));
    	}
    	
    	//해시셋 값을 리스트에 넣기
    	for(int num : set) {
    		list.add(num);
    	}
    	
    	//오름차순 정렬
    	Collections.sort(list);
    	
    	for(int num : list) {
    		sb.append(num).append(" ");    		
    	}
    	
    	System.out.println(sb);
    }
}	
