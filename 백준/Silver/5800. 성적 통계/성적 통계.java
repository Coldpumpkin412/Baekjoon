import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		//반의 수 K 입력
		int K = sc.nextInt();
		
		//몇 반인지 확인하는 변수
		int count=1;
		
		while(K-->0) {
			
			//학생 수 입력 및 학생수에 따른 배열 선언
			//내림차순 배열에서활용되는 Collections.reverseOrder()는 int형으로 사용불가, Integer 선언
			int N = sc.nextInt();
			Integer[] student = new Integer[N]; 
			
			//배열값 부여
			for(int i=0 ; i<N ; i++) {
				student[i] = sc.nextInt();
			}
			
			//내림차순으로 정렬
			Arrays.sort(student, Collections.reverseOrder());
			
			//인접 배열들을 확인하며 가장 큰 차이 구하기
			int largest_gap = 0;
			for(int i=0 ; i<N-1 ; i++) {
				//내림차순 정렬돼있으므로 순서대로 빼주면 무조건 양수(절대값 필요X)
				largest_gap = Math.max(largest_gap, student[i] - student[i+1]);
			}
			
			//출력
			sb.append("Class ").append(count).append("\n");
			sb.append("Max ").append(student[0]).append(", Min ").append(student[N-1]).append(", Largest gap ").append(largest_gap).append("\n");
			
			//클래스 증가
			count++;
		}
		
		System.out.println(sb);
		
	}
}

	
