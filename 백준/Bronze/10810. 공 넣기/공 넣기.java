import java.util.*;
import java.io.*;


public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		//바구니에 들어있는 공을 저장할 맵 선언 key : 바구니 번호, value : 공 번호
		Map<Integer, Integer> map = new HashMap<>();
		
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		for(int i=0 ; i<M ; i++) {
			st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			int number = Integer.parseInt(st.nextToken());
			
			//맵 업데이트 해주기
			for(int j=start ; j<=end ; j++) {
				map.put(j, number);
			}
		}
		
		for(int i=1 ; i<=N ; i++) {
			//비어있으면 0 넣어주기
			if(map.get(i)==null) map.put(i, 0);
			System.out.print(map.get(i) + " ");
		}
	}
}

	
