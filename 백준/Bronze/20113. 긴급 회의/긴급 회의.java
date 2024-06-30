import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
        //플레이어 수 N 입력    
		int N = sc.nextInt();
        
        //정수 저장할 배열 선언
		int[] players = new int[N+1];
        
		//정수 입력
		for(int i=0 ; i<N ; i++) {
			int tmp = sc.nextInt();
            
			players[tmp]++;
		}
        
		int max = 0;
		int idx = 0;
        
		for(int i=1 ; i<=N ; i++) {
            if(players[i]>max) {
				max = players[i];
				idx = i;
			}
        }
			
		for(int i=1 ; i<=N ; i++) {
            if(idx!=i && players[i]==max) {
				System.out.println("skipped");
				return;
			}
        }
        
		System.out.println(idx);
	}
}