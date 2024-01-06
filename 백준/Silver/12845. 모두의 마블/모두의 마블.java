import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
        //카드 개수 입력
		int N = Integer.parseInt(br.readLine());	
        
        //카드 레벨 입력후 배열형태로 저장
		String[] arr = br.readLine().split(" ");
		
        //레벨 최댓값, 누적합 변수 선언
		int max = 0;
        int sum = 0;
        
		for(int i=0 ; i<N ; i++) {
            //현재 카드레벨 (정수형 변환)
			int L = Integer.parseInt(arr[i]);
			
            //카드레벨 누적합
			sum += L;	
			
            //최대레벨
            max = Math.max(max, L);
		}
		
		System.out.println(sum + (max*(N-2)));
	}
}