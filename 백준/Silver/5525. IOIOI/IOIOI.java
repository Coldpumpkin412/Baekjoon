import java.util.*;
import java.io.*;

public class Main {
	static int N,M;
	static boolean[] visited ;
	static int[] board;
	static int[] dice = {1,2,3,4,5,6};
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//N입력
		int N = Integer.parseInt(br.readLine());
		
		//S의 길이(M) 입력
		int M = Integer.parseInt(br.readLine());
		
		//S입력
		String S = br.readLine();
		
		//문자열 S를 한글자씩 저장할 배열
		char[] arr = new char[1000001];
		for(int i=0 ; i<M ; i++) {
			arr[i] = S.charAt(i);
		}
		
		int answer = 0;
		for(int i=0 ; i<M-2 ; i++) {
			if(arr[i+1]=='O' && arr[i+2]=='I') { //기준점 이후가 'OI'인경우
				int count=0;
				
				//'IO'가 반복되는만큼
				while(arr[i]=='I' && arr[i+1]=='O') {
					count++;
					i+=2;
					
					if(arr[i]=='I' && count==N) {
						answer++;
						count--;
					}
				}
			}
		}
		
		System.out.println(answer);
		
	}
}

	
