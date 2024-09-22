import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
        //N, M 입력
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		//HashSet에 저장
		Set<Integer> set = new HashSet<>();
        
		st = new StringTokenizer(br.readLine());
		for(int i=0 ; i<M ; i++) {
			int k = Integer.parseInt(st.nextToken());
            
			for(int j=k ; j<=N ; j+=k) {
				set.add(j);
			}
		}

		int sum = 0;
        
		for(int i : set) {
			sum += i;
		}
        
		System.out.println(sum);
	}
}