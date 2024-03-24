import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
        //손님 수 N 입력 및 배열 선언
		int N = sc.nextInt();
        
		int[] humans = new int[N];
        
        //배열 값 입력
		for(int i=0 ; i<N ; i++) {        
            humans[i] = sc.nextInt();
        }
			
		
		int count = 0;
        
		for(int i=0 ; i<N ; i++) {
			int tmp = humans[i];
            
			for(int j=i+1 ; j<N ; j++) {
				if(tmp==humans[j]) {
					count++;
					break;
				}
			}
		}
		System.out.println(count);
	}
}