import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
        //수열 길이 N 입력
        int N = sc.nextInt();
        
        //수열 선언
		int[] arr = new int[N];

		for(int i=0 ; i<N ; i++) {
			arr[i] = sc.nextInt();
		}
		

		if(arr[2]-arr[1] == arr[1]-arr[0]) {
            System.out.println(arr[N-1] + arr[N-2] - arr[N-3]);
        }else {
            System.out.println(arr[N-1] * (arr[N-2] / arr[N-3]));
        }
			
			
		
	}
}