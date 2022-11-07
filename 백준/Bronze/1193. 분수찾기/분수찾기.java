import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int X = sc.nextInt(); //입력값 X
		int n=0;
		int count=0;
		int top=1; //분자
		int bottm=1; //분모
		
		if(X==1) System.out.println("1/1");
		else {
			while(count<X) {
				n++;
				count = n*(n+1)/2; //주어진 값이 몇번째 행인지 찾음
			}
			int num = X-(n-1)*n/2; //행의 몇번 째 값?
			if(n%2==0) {//짝수 그룹인 경우
				top=num;
				bottm=n-num+1;
			}
			else {//홀수 그룹인 경우
				top=n-num+1;
				bottm=num;
			}
            System.out.print(top+"/"+bottm);
		}
		
	}

}