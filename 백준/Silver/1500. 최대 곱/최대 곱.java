import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
        //S 및 K 입력
		int S = sc.nextInt();
		int K = sc.nextInt();
        
        //몫과 나머지 저장 변수
		int div = S/K; 
		int mod = S%K;
        
        //정답변수 선언 및 초기화
		long answer = 1;
		for (int i=1 ; i<=K ; i++) {
            //i가 나머지보다 작거나 같다면
			if(i<=mod) {
                //(몫+1) 값을 곱해주기
				answer *= (div+1);
			}else {
                //아니라면 몫을 곱해주기
				answer *= div;
			}
		}
        
        //정답 출력
		System.out.println(answer);
	}	
}