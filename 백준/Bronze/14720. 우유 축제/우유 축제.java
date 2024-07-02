import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
        // 우유 가게 수 B 입력
		int N = sc.nextInt(); 
		int[] line = new int[N]; // 우유 가게 수 만큼 배열 생성
        
		int count = 0; // 최대 먹을수 있는 우유 개수
		int next = 0; // 다음으로 먹을 수 있는 우유 종류
        
		for(int i=0 ; i<line.length ; i++) {
			line[i] = sc.nextInt();
		}

		for(int i=0 ; i<line.length ; i++) {
			if(line[i]==next && next==0) {
				count++;
				next = 1;
				continue;
			}
			if(line[i]==next && next==1) {
				count++;
				next = 2;
				continue;
			}
			if(line[i]==next && next==2) {
				count++;
				next = 0;
				continue;
			}

		}

		System.out.println(count);

	}
}