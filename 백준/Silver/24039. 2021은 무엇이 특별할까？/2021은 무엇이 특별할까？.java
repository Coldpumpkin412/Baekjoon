import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
        
        //N 입력
		int N = sc.nextInt();
        
        //소수 저장할 리스트 선언
		List<Integer> list = new ArrayList<Integer>();

		//10000까지의 소수 찾기
        int j;
		for (int i=2 ; i<=10000 ; i++) {
			for (j=2 ; j<i ; j++) {
				if (i%j == 0) {
					break;
				}
			}

			if (i == j) {
				list.add(i);
			}
		}

		
		int result = 0;
		for (int i=0 ; i<list.size() ; i++) {
            
            //두 소수의 곱
			result = list.get(i) * list.get(i+1);
            
            //N보다 큰 최초의 수 발견시 출력 후 종료
			if (result > N) {
				System.out.println(result);
				return;
			}
		}
	}
}