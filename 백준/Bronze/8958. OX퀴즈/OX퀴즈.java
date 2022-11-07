import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] answer = new String[sc.nextInt()]; //배열 개수

		
		for(int i=0 ; i<answer.length ; i++) {
			answer[i] = sc.next(); //OX입력 받아서 배열에 저장
		}
		
		sc.close();
		
		for(int i=0 ; i<answer.length ; i++) {
			int count = 0;
			int sum=0;
			
			for(int j=0 ; j<answer[i].length() ; j++) {
				if(answer[i].charAt(j) == 'O') {
					count++;
					sum = sum+count;
				}
				else count = 0;
			}
			System.out.println(sum);
		}

	}
}
