import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        
        //N입력 및 배열 선언
		int N = sc.nextInt();
		Integer[] tip = new Integer[N];
		
        //배열값 입력
		for(int i=0 ; i<N ; i++){
            tip[i] = sc.nextInt();
        }
			
		//배열 정렬
		Arrays.sort(tip, Collections.reverseOrder());
		
		long answer = 0; 
        
		for(int i=0 ; i<N ; i++) {
			int give = tip[i]-i; // 커피를 받아가는 순위에 따른 팁 값 계산
			
            // 액수가 음수가 아니라면 누적액 계산
			if(give>=0){
                answer += give;
            }
				
		}
		System.out.println(answer);
	}

}