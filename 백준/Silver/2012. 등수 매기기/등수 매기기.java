import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
        //N 입력 및 배열 선언
		int N = sc.nextInt();
        int[] arr = new int[N];
        
		int B = 1;		// 실제 등수
		long answer = 0;	// 불만도 합 최솟값
        
		//배열 값 입력 후 정렬
		for(int i=0 ; i<arr.length ; i++){
            arr[i] = sc.nextInt();
        }
		Arrays.sort(arr);
		
        //차이의 절댓값 누적해서 더해주기
		for(int i=0 ; i<arr.length ; i++) {
			answer += Math.abs(arr[i] - (i+1));			
		}
		
		System.out.println(answer);
	}

}