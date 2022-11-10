import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(); //전체 사람의 수 입력
		int[][] body = new int[N][2]; //몸무게

		
		for(int i=0 ; i<N ; i++) {
			body[i][0] = sc.nextInt();
			body[i][1] = sc.nextInt(); //덩치입력
		}
		
		for(int i=0 ; i<N ; i++) {
			int rank = 1; //순위
			for(int j=0 ; j<N ; j++) {
				if(i==j) continue; //자기자신과 비교X
				if(body[i][0]<body[j][0] && body[i][1]<body[j][1]) rank++;
			}
			System.out.print(rank+" ");
		}
	}
}