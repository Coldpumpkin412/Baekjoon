import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); //시험 본 과목의 개수
		double[] score = new double[N]; //시험 점수 저장배열
		double MAX = 0; //최고 점수
		double average = 0; //평균값을 위해 합 저장
		
		for(int i=0 ; i<N ; i++) {
			score[i] = sc.nextInt(); //원래 시험점수 저장
			if (score[i] >= MAX) MAX = score[i]; //최고점 저장
		}
		
		for(int i=0 ; i<N ; i++) {
			score[i] = score[i]/MAX*100; //조작된 점수 저장
			average += score[i];
		}
		
		average /= N;
		
		System.out.println(average);
		
	}
}