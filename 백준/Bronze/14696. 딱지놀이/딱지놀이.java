import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
		//라운드 수 N 입력
		int N = sc.nextInt();
		
		for (int i=0 ; i<N ; i++) {
			int A_num = sc.nextInt();
			int[] A_card = new int[5];
			
			//A 카드 개수 저장
			for (int j=0 ; j<A_num ; j++) {
				A_card[sc.nextInt()] ++;
			}
			
			int B_num = sc.nextInt();
			int[] B_card = new int[5];
			
			//B 카드 개수 저장			
			for (int j=0 ; j<B_num ; j++) {
				B_card [sc.nextInt()] ++;
			}
			
			boolean flag = false;
            
			for (int j=4 ; j>0 ; j--) {
				
				//4의 개수 확인
				if (A_card[j] > B_card[j]) {
					System.out.println("A");
					break;
				} else if (A_card[j] < B_card[j]){
					System.out.println("B");
					break;
				}
				
				if (j==1 && A_card[j]==B_card[j]) {
                    flag = true;
                }
				 
			}
			//비겼으면 D 출력
			if (flag) {
                System.out.println("D");
            }
		}
		
	}
}