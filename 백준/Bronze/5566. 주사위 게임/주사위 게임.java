import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
        //N, M 입력
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int[] arr = new int[N];
		
		for(int i=0 ; i<N ; i++) {
			arr[i] = sc.nextInt();
		}
		
		int index = 0;
		int count = 0;
		
		for(int i= 1; i<=M ; i++) {
			int now = sc.nextInt();
            
			index += now;
            
			if(index >= N-1) {
				count = i;
				break;
			}
			
			int num = arr[index];
            
			index += num;
            
			if(index >= N-1) {
				count = i;
				break;
			}
		}
        
		System.out.println(count);
	}
}