import java.util.*;
import java.io.*;

public class Main {
	
	static int N;
	static int K;
	
	static boolean check;
	
	static StringBuilder sb = new StringBuilder();
	
	//selection_sort함수(배열, 교환횟수)
	static void selection_sort(int[] num, int count) {
		
		//가장 큰 인덱스부터 두 번째 인덱스까지
		for(int last = num.length-1 ; last>=2 ; last--) {
			int max = 0;
			int index = -1;
			
			//배열인덱스 1~last 까지의 값중 최댓값의 인덱스 찾기
			for(int i=1 ; i<=last ; i++) {
				if(max < num[i]) {
					max = num[i];
					index = i;
				}
			}
			
			//최댓값의 인덱스가 끝 인덱스가 아닌경우 두 배열값 교환
			if(last != index) {
				//교환 횟수 증가
				count++;
				
				int tmp = num[index];
				num[index] = num[last];
				num[last] = tmp;
			}
			
			//교환횟수가 count와 같아진경우
			if(count == K) {
				//체크함수 바꾸기
				check = true;
				
				//당시에 배열 값 저장
				for(int i=1 ; i<=N ; i++) {
					sb.append(num[i]+" ");
				}
				
				return;
			}
		}
	}
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st;    	
    	
    	//배열의 크기 N, 교환 횟수 K 입력
    	st = new StringTokenizer(br.readLine());
    	N = Integer.parseInt(st.nextToken());
    	K = Integer.parseInt(st.nextToken());
    	
    	//배열 A 선언 및 값 입력
    	int[] A = new int[N+1];
    	
    	st = new StringTokenizer(br.readLine());
    	for(int i=1 ; i<=N ; i++) {
    		A[i] = Integer.parseInt(st.nextToken());
    	}
    	
    	//선택정렬 메소드 실행
    	selection_sort(A, 0);
    	
    	//check가 참이면 배열출력, 아니면 -1 출력
    	System.out.println(check ? sb.toString() : -1);
    	
    }
}	
