import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException{
		/*
		 * 축에 평행한 직사각형이기 때문에 좌표가(a,b), (c,b), (a,d), (c,d) 꼴로 나오게 된다.
		 * 즉, 각 숫자가 2번씩 등장하는 걸 활용하면 된다.
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		//x좌표와 y좌표의 빈도수를 저장할 해시맵 선언(key : 각 좌표의 수, value : 빈도수)
		Map<Integer, Integer> x = new HashMap<>();
		Map<Integer, Integer> y = new HashMap<>();
		
		//세 점의 좌표 입력
		for(int i=0 ; i<3 ; i++) {
			st = new StringTokenizer(br.readLine());
			
			int first = Integer.parseInt(st.nextToken());
			int second = Integer.parseInt(st.nextToken());
			
			x.put(first, x.getOrDefault(first, 0)+1);
			y.put(second, y.getOrDefault(second, 0)+1);
		}
		
		//value가 1인(빈도수가 1인) key값을 stringbuilder에 저장
		for(int key : x.keySet()){
			if(x.get(key)==1) sb.append(key).append(" ");
		}
		for(int key : y.keySet()){
			if(y.get(key)==1) sb.append(key);
		}
		
		//결과값 출력
		System.out.println(sb);
	}
}

	
