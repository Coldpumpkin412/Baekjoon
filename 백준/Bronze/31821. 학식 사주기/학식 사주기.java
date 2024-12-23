import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        //메뉴 개수 N 입력
		int N = Integer.parseInt(br.readLine());
		
        //가격 저장 배열
		int[] price = new int[N+1]; 
        
        //가격 입력
		for(int i=1 ; i<=N; i++) {
			price[i] = Integer.parseInt(br.readLine());
		}
		
		int sum = 0; 
        
        //새내기 인원 수
		int M = Integer.parseInt(br.readLine()); 
        
		for(int i=0 ; i<M ; i++) {
			 //먹고 싶어하는 메뉴 가격 누적합
			sum += price[Integer.parseInt(br.readLine())];
		}
		
		System.out.println(sum);
	}
}
