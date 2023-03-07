import java.util.*;
import java.io.*;


public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		Map<Integer, Integer> map = new HashMap<>();
		
		//배열의 크기 N 입력
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		int[] answer = new int[N];
        
		//N개의 값 입력 후 배열에 넣기
		st = new StringTokenizer(br.readLine());
		for(int i=0 ; i<N ; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			answer[i] = arr[i];
		}
		
		//배열 오름차순 정렬
		Arrays.sort(arr);
		
		//맨 앞의 요소는 제일 작은 숫자이기 때문에 0
		map.put(arr[0], 0);
		
		int count=0;
		for(int i=1 ; i<N ; i++) {
			//앞의 숫자와 같다면
			if(arr[i] == arr[i-1]) {
				map.put(arr[i], count);
			}else { //같지않다면 value 그대로 입력
				count++;
				map.put(arr[i], count);
			}
		}
		
		for(int i=0 ; i<N ; i++) {
			sb.append(map.get(answer[i])).append(" ");
		}
		
		System.out.println(sb);
	}
}

	
