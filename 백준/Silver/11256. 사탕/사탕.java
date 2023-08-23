import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
        
        //테스트 케이스 T 입력
		int T = Integer.parseInt(br.readLine()); 

		while(T-->0) {
			st = new StringTokenizer(br.readLine());
			
			int candy = Integer.parseInt(st.nextToken()); 
			int box = Integer.parseInt(st.nextToken()); 
			int cnt = 0;
			
			Integer[] list = new Integer[box];
					
			for(int i=0 ; i<box ; i++) {
				st = new StringTokenizer(br.readLine());
				
				int r = Integer.parseInt(st.nextToken());
				int c = Integer.parseInt(st.nextToken());
                
				list[i] = r * c;
			}
            //내림차순 정렬
			Arrays.sort(list, Comparator.reverseOrder());  
			
			for(int i=0 ; i<box ; i++) {
				candy = candy - list[i];
				cnt++;
				
				if(candy <= 0) {
					break;
				}
			}
			
			System.out.println(cnt);
		}
	}
}