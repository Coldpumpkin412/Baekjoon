import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	//테스트케이스 T 입력
    	int T = Integer.parseInt(br.readLine());
    	
    	while(T-->0) {
    		//후보자 수 N 입력 및 후보자 배열 선언
    		int N = Integer.parseInt(br.readLine());
    		int[] candidate = new int[N];
    		
    		//총 득표수 변수 선언
    		int sum = 0;
    		
    		//최다득표자 인덱스
    		int index = 0;
    		
    		//최다득표 변수
    		int max = 0;
    		
    		//후보자 별 득표 수 입력 및 총 득표수 확인
    		for(int i=0 ; i<N ; i++) {
    			int num = Integer.parseInt(br.readLine());
    			
    			candidate[i] = num;
    			sum += num;
    			
    			//최다득표가 갱신되면 득표자 인덱스 및 득표수저장
    			if(max < num) {
    				index = i+1;
    				max = num;
    			}
    		}
    		
    		//최다득표자가 인원 수 확인
    		int count = 0;
    		for(int i=0 ; i<N ; i++) {
    			if(candidate[i] == max) {
    				count++;
    			}
    		}
    		//한 명 초과인경우
    		if(count>1) {
    			System.out.println("no winner");
    			continue;
    		}
    		
    		//최다득표자 득표가 과반수를 넘은경우
    		if(max > sum/2) {
    			System.out.println("majority winner "+ index);
    		}else if(max <= sum/2) {//최다득표자 득표가 과반수를 넘지못한경우
    			System.out.println("minority winner "+ index);
    		}
    		
    	}
    }
}	
