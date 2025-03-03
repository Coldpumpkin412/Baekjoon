import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
        
        //정수 개수
		int N = Integer.parseInt(br.readLine());
		
		//수를 저장하는 큐
		Queue<Integer> queue = new LinkedList<>();
		
        st = new StringTokenizer(br.readLine());
		while(st.hasMoreElements()) {
			queue.add(Integer.parseInt(st.nextToken()));
		}
		
		int num = queue.poll();
		
		sb.append("YES").append("\n");
        
		if(num == 0) {
			sb.append(0);
		}else {
			sb.append(num).append(num).append(num);
		}
		
		System.out.println(sb.toString());
	}
}