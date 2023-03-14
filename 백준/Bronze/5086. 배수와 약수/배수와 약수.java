import java.util.*;
import java.io.*;


public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		while(true) {
			st = new StringTokenizer(br.readLine());
			
			int first = Integer.parseInt(st.nextToken());
			int second = Integer.parseInt(st.nextToken());
			
			//둘 다 입력이 0 이라면 종료
			if(first==00 && second==0) return;
			
			//첫 번째 수가 두 번째 수의 약수라면 factor
			if(second%first == 0) {
				System.out.println("factor");
				continue;
			}
			else if(first%second == 0) {//첫 번째 수가 두 번째 수의 배수라면 multiple
				System.out.println("multiple");
				continue;
			}else {
				System.out.println("neither");
				continue;
			}
		}
		
		
		
	}
}

	
