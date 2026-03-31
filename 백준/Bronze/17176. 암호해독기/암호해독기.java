import java.util.*;
import java.io.*;

public class Main {	
    
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st;
    	
    	//주어진 수열의 길이 N 입력
    	int N = Integer.parseInt(br.readLine());
    	
    	//암호문에 해당하는 문자에 대한 빈도 저장 배열 선언
    	int[] code_count = new int[53];
    	
    	//평문에 해당하는 문자에 대한 빈도 저장 배열 선언
    	int[] sentence_count = new int[53];
    	
    	//암호문에 해당하는 숫자 N개 입력
    	st = new StringTokenizer(br.readLine());
    	for(int i=0 ; i<N ; i++) {
    		int num = Integer.parseInt(st.nextToken());
    		
    		//해당 숫자에 대한 빈도수 증가
    		code_count[num]++;
    	}
    	
    	//평문 입력 
    	String str = br.readLine();
    	
    	//평문 문자들 아스키코드 활용하여 숫자로 변환(띄어쓰기는 예외)
    	for(int i=0 ; i<str.length() ; i++) {
    		char word = str.charAt(i);
    		
    		//띄어쓰기 일때를 디폴트 값으로 설정
    		int index = 0;
    		
    		if('A'<=word && word<='Z') {
    			index = word -'A' + 1;
    		}else if('a'<=word && word<='z') {
    			index = word - 'a' + 27;
    		}
    		
    		//평문 빈도배열 갱신
    		sentence_count[index]++;
    	}
    	
    	//두 빈도수 배열 비교
    	for(int i=0 ; i<53 ; i++) {
    		if(code_count[i] != sentence_count[i]) {
    			System.out.println("n");
    			return;
    		}
    	}
    	
    	System.out.println("y");
    }
}
