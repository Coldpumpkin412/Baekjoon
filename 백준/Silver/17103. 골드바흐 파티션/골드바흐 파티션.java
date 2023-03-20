import java.util.*;
import java.io.*;

public class Main {
	//각 테스트케이스에 입력될 수
	static int number;
	//각 소수들을 저장할 배열(해당 인덱스가 소수가 아닐경우 true로 변환)
	static boolean[] arr;
	
	//소수 판별 메소드(에라토스테네스의 체 활용)
	static void prime(int number) {
		//배열값 모두 false로 초기화
		arr = new boolean[number+1];
		
		for(int i=2 ; i<=Math.sqrt(number+1) ; i++) {
			if(!arr[i]) { //해당 인덱스의 배열값이 false라면(소수라면) 배수들은 모두 true로 변환
				for(int j=i*i ; j<=number ; j+=i) {
					arr[j] = true;
				}
			}
		}
	}
	
	public static void main(String[] args) throws IOException{
		/*
		 * 에라토스테네스의 체 : 소수인 수의 배수들을 지우면 소수만 남게된다
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		//골드바흐 파티션의 수
		int count;
		
		//테스트케이스의 수 입력
		int T = Integer.parseInt(br.readLine());
		
		while(T-->0) {
			//count 초기화
			count = 0;
			
			number = Integer.parseInt(br.readLine());
			
			//소수 메소드 실행
			prime(number);
			
			for(int i=2 ; i<=number/2; i++) {
				//합이 number인 두 정수가 모두 false일 때(소수 일 때) count++
				if(!arr[i] && !arr[number-i]) count++;
			}
			
			sb.append(count).append("\n");
		}
		
		//마지막 개행 지워준 후 출력
		System.out.println(sb.deleteCharAt(sb.length()-1));
	}
}

	
