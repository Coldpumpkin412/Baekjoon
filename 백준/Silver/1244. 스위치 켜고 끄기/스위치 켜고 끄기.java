import java.util.*;
import java.io.*;

public class Main {
	//스위치 개수
	static int N;
	//스위치 배열
	static int[] button;
	
	//Girl 함수에 사용할 변수
	static int range;
	
	//Man 함수
	static void Man(int index) {
		int count = 1;
		
		//남자가 받은 번호의 배수를 번호로 가지는 스위치들 상태변경
		while(count*index <= N) {
			button[count*index] = button[count*index]==1 ? 0 : 1; 
			
			count++;
		}
	}
	
	//Girl 함수
	static void Girl(int index) {
		//range 변수 초기화
		range = 0;
		
		//대칭을 확인했을 때 범위에 벗어나지 않고 숫자가 대칭을 이루는경우
		while(index-range>0 && index+range<=N && button[index-range]==button[index+range]) {
			range++;
		}
	}
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st;
    	StringBuilder sb = new StringBuilder();
    	
    	//스위치의 개수 입력
    	N = Integer.parseInt(br.readLine());
    	
    	//스위치 배열 선언 및 각 스위치의 상태 입력(on : 1, off : 0)
    	button = new int[N+1];
    	
    	st = new StringTokenizer(br.readLine());
    	for(int i=1 ; i<=N ; i++) {
    		button[i] = Integer.parseInt(st.nextToken());
    	}
    	
    	//학생 수 입력
    	int student = Integer.parseInt(br.readLine());
    	
    	//학생의 성별, 받은 수 입력(남자 : 1, 여자 : 2)
    	for(int i=0 ; i<student ; i++) {
    		st = new StringTokenizer(br.readLine());
    		int gender = Integer.parseInt(st.nextToken());
    		int number = Integer.parseInt(st.nextToken());
    		
    		//성별이 남자인경우
    		if(gender == 1) {
    			Man(number);
    		}else {//성별이 여자인경우
    			Girl(number);
    			
    			//Girl함수에서 정해진 range에 따라 대칭적으로 스위치 상태 변경
    			for(int j=0 ; j<range ; j++) {
    				if(j == 0) {
    					button[number] = button[number]==1 ? 0 : 1;
    					
    					continue;
    				}
    				
    				button[number-j] = button[number-j]==1 ? 0 : 1;
    				button[number+j] = button[number+j]==1 ? 0 : 1;
    			}
    		}
    	}
    	
    	//한 줄에 20개씩 출력
    	for(int i=1 ; i<=N ; i++) {
    		sb.append(button[i]).append(" ");
    		
    		if(i%20 == 0) {
    			sb.append("\n");
    		}
    	}
    	
    	System.out.println(sb.toString());
    }
}	
