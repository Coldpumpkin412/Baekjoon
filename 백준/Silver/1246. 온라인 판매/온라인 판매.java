import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
        
        st =  new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M =Integer.parseInt(st.nextToken());
		
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i=0 ; i<M ; i++) {
			list.add(Integer.parseInt(br.readLine()));
		}
		
		Collections.sort(list);
		
		int answer = 0;
		int max = 0;
		
		for(int i=0 ; i<M; i++) {
			int tmp = list.get(i);
			int sum = 0;
			
			if(M-i < N) {
				sum = tmp * (M-i);
			}else {
				sum = tmp * N;
			}
			
			if(sum > max) {
				max = sum;
				answer = tmp;
			}
		}
		System.out.println(answer + " "+ max);
	}
}