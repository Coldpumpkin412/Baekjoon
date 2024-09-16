import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st; 
        
        //책의 개수 N 입력
		int N = Integer.parseInt(br.readLine());
		
		int[] price = new int[N];
        
        //책 가격 입력
        st = new StringTokenizer(br.readLine());
		for(int i=0 ; i<N ; i++) {
			price[i] = Integer.parseInt(st.nextToken());
		}
		
		//오름차순 정렬
		Arrays.sort(price);
        
        //최솟값
		int min = price[0];
        
		int page = 1;
        
		for(int i=1 ; i<N ; i++) {
            //2배 이상 가격인 경우
			if(min*2 <= price[i]) { 
				page++; 
                
                //최솟값 갱신
				min = price[i]; 
			}
		}
		
		System.out.println(Integer.toString(page));
	}
}