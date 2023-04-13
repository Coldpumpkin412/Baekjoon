import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		
		//분(N), 처음맥박(m), 최대맥박(M), 분당맥박증가량(T), 분당맥박감소량(R) 입력
		int N = sc.nextInt();
		int m = sc.nextInt();
		int M = sc.nextInt();
		int T = sc.nextInt();
		int R = sc.nextInt();
		
		
		//결과, 운동시간, 처음맥박 초기화
		int answer = 0;
		int exercise = 0;
		int first_m = m; 
		
		while(exercise != N) {
			answer++;
			
			//운동 후 맥박<최대맥박 : 운동시작, 아니면 휴식
			if(m+T <= M) {
				m += T;
				exercise++;
			}else {
				m -= R;
				
				//처음맥박보다 떨어지면 다시 세팅
				if(m < first_m) m = first_m;
			}
			
			//운동 후 맥박>최대맥박, 맥막이 초기맥박
			if((m+T>M) && (m==first_m)) break;
		}
		
		if(exercise != N) System.out.println(-1);
		else System.out.println(answer);
	}
}

	
