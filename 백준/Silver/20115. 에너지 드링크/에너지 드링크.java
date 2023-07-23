import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
        //N 입력 및 배열 선언
        int N = sc.nextInt();
		double[] arr = new double[N];
        
        //최댓값 초기화 및 배열 값입력
		double max = 0;
		for (int i=0 ; i<N ; i++) {
			arr[i] = sc.nextDouble();
            
            //최신화
            max = Math.max(max, arr[i]);
		}
        
		double answer = max;
		for (int i=0 ; i<N ; i++) {
			if (arr[i]==max){
                continue;
            }
				
			answer += arr[i]/2;
		}
        
		System.out.println(answer);
	}
}