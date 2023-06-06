import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//난이도 의견의 개수 선언 및 난이도 저장 배열 선언
		int N = Integer.parseInt(br.readLine());
		
		if(N==0) {
			System.out.println(0);
			return;
		}
		int[] arr = new int[N];
		
		
		//난이도 입력 및 오름차순 정렬
		for(int i=0 ; i<N ; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(arr);
		
		//30%절사평균에서 활용될 변수(소수점은 반올림)(위 아래에서 제외 해주기때문에 30%에서 /2 까지 해준다
		int var = Integer.parseInt(String.format("%.0f", N*3/20.0));
		
		//절사평균에 활용될 합 변수
		int sum=0;
		for(int i=var ; i<N-var ; i++) {
			sum += arr[i];
		}
		
		//평균값
		int avg = Integer.parseInt(String.format("%.0f", (double) sum/(N-var*2)));
		
		System.out.println(avg);
	}
}	
