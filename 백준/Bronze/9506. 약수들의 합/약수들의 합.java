import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb;
		
		while(true) {
			sb = new StringBuilder();
			
			int n = Integer.parseInt(br.readLine());
			int sum = 0;
			
			//입력이 -1이면 종료
			if(n==-1) return;
			
			for(int i=1 ; i<n ; i++) {
				//약수인 경우 누적합
				if(n%i==0) {
					sum += i;
					sb.append(" ").append(i).append(" ").append("+");
				}
			}
			
			if(n==sum) { //완전수인 경우
                //맨 앞에 n과 '=' 입력
				sb.insert(0, Integer.toString(n)).insert(Integer.toString(n).length(), " =");
                //맨 뒤에 '+' 삭제
				sb.deleteCharAt(sb.length()-1);
			}else {//완전수가 아닌경우
                //StringBuilder 초기화
				sb = new StringBuilder();
				sb.append(Integer.toString(n)).append(" is NOT perfect.");
			}
			
			System.out.println(sb);
		}
		
	}
}

	
