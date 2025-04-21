import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = 1;
				
		while(true) {
			int N = Integer.parseInt(br.readLine());
			
			if(N == 0) {
                break;
            }
			
			//n의 짝수 여부 조건문
			if(N%2 == 0) {
				N = (((N * 3) / 2) * 3) / 9;
				System.out.println(count + ". even " + N);
			}else {
				N = ((((N * 3) + 1) / 2) * 3) / 9;
				System.out.println(count + ". odd " + N);
			}
			count++;
		}
	}

}