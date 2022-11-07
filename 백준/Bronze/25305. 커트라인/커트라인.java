import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(); //응시자의 수 입력
		int k = sc.nextInt(); //상을 받는 사람의 수
		int tmp; //정렬에 쓰일 변수
		
		int[] score = new int[N]; 
		
		for(int i=0 ; i<N ; i++) {
			score[i] = sc.nextInt(); //응시자 별 점수 입력
		}
		
		for(int i=0 ; i<N-1 ; i++) {
			for(int j=i ; j<N ; j++) { //오름차순 정렬
				if(score[i]>score[j]) {
					tmp = score[i];
					score[i] = score[j];
					score[j] = tmp; 
				}
			}
		}
		
		System.out.println(score[N-k]); //커트라인 출력
		
	}

}