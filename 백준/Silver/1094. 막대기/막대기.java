import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int X = sc.nextInt();

		int bar = 64;
		int answer = 0;
	
		while(X>0){
			if(bar > X) bar /= 2;
			else{
				answer++;
				X -= bar;
			}
		}
		
		System.out.println(answer);
	}
}