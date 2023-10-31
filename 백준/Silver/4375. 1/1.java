import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNextInt()) {
			//N입력
            int N = sc.nextInt();
            
            int num = 0;
            
            for(int i=1 ; ; i++) {
            	//1부터 시작해서 11, 111, 1111 처럼 '1'을 하나씩 늘려간다
                num = (num*10) + 1;
                
                num %= N;
                
                //N으로 나눈 나머지가 0인경우 그 떄의 자릿수 출력
                if(num == 0) {
                    System.out.println(i);
                    break;
                }
            }
        }
    }
}	
