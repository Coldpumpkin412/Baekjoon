import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
        //N입력
		int N = sc.nextInt();
		
        //짝수이면 SK를, 아니면 CY출력
        if(N%2==0) {
            System.out.println("SK");
        }else {
            System.out.println("CY");
        }
			
	}

}