import java.util.*;

public class Main {

	static StringBuilder sb = new StringBuilder();
	static int count = 0;
    
    //hanoi 함수(from : 출발지, to : 목적지, other : 둘 다 x)
	public static void hanoi(int n, int from, int to, int other) {
		if (n == 0)
			return;
		else {
            //횟수 증가
			count++;
            
            //1. 출력 예시처럼 3개의 탑이 있다면, 2개의 탑을 목적지가 아닌곳으로 옮겨 놓음
			hanoi(n - 1, from, other, to);
			
            //2. 마지막 남은 탑을 목적지로 옮김.
			sb.append(from + " " + to + "\n");
			
            //3. 목적지가 아닌 곳 에 옮겨놓았던 탑들을 목적지로 옮김
			hanoi(n - 1, other, to, from);
		
		}
	}

	public static void main(String[] args) {
        //재귀 활용하여 퓰기
        
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		hanoi(n, 1, 3, 2);

		System.out.println(count);
		System.out.println(sb);

	}

}
