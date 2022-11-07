import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int C = sc.nextInt(); //테스트케이스 개수입력
		int N; //테스트케이스 별 학생 수
		double[] score = new double[1000]; //테스트케이스 별 점수 저장 배열
		double[] avg = new double[100]; //케이스별 평균		
		double[] ratio = new double[C]; //평균 넘는 학생 비율 저장
		
		for(int i=0 ; i<C ; i++) {
			N = sc.nextInt(); //학생 수 입력
			double count = 0; //평균 넘는 학생 수
			double sum = 0; //학생들 점수 합 저장

			
			for(int j=0 ; j<N ; j++) {
				score[j] = sc.nextDouble(); //학생 별 점수 입력
				sum += score[j];
			}
			avg[i] = sum / N;
			
			for(int k=0 ; k<N ; k++) {
				if(avg[i] < score[k]) count++; //평균을 넘는 학생 수 카운트
				else continue;
			}
			ratio[i] = count / N * 100;
		}
		
		for(int i=0 ; i<C ; i++) {
			System.out.printf("%.3f%%\n", ratio[i]);
		}
	
		sc.close();
	}
}
