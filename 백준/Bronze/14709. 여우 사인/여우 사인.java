import java.util.*;
import java.io.*;

public class Main {	
    
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
        
        //서로 닿아있는 손가락 쌍의 개수 입력
		int N = Integer.parseInt(br.readLine());
		
		//손가락이 닿은 횟수 해시맵 선언(key : 몇번째 손가락, vale : 닿은 횟수)
		Map<Integer, Integer> finger = new HashMap<>();
		
		//초기값
		for(int i=1 ; i<=5 ; i++) {
			finger.put(i, 0);
		}
		
		//순서쌍 입력		
		for(int i=0 ; i<N ; i++) {
			st = new StringTokenizer(br.readLine());
			int first = Integer.parseInt(st.nextToken());
			int second = Integer.parseInt(st.nextToken());
			
			finger.put(first, finger.getOrDefault(first, 0)+1);
			finger.put(second, finger.getOrDefault(second, 0)+1);
		}
		
		if(finger.get(1)>=1 && finger.get(2)==0 && finger.get(3)>=2 && finger.get(4)>=2 && finger.get(5)==0) {
			System.out.println("Wa-pa-pa-pa-pa-pa-pow!");
		}else {
			System.out.println("Woof-meow-tweet-squeek");
		}
    }
}
