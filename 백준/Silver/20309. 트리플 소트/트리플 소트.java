import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
        
		String word = "YES";
		
        //N 입력
		int N = sc.nextInt();
        
		for(int i=0 ; i<N ; i++) {
			int num = sc.nextInt();
            
			//짝수 자리 & 홀수
			if(i%2==1 && num%2==1) {
				word = "NO";
			}else if(i%2==0 && num%2==0) { //홀수 자리 & 짝수
				word = "NO";
			}
		}
        
		System.out.println(word);
	}
}