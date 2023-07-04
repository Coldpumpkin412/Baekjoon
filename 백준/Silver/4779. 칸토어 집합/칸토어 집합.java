import java.util.*;
import java.io.*;

public class Main {
	static int n;
	static StringBuilder sb;
	
	//func함수
	public static void func(int start, int size) {
		if(size==1) { //길이가 1이면 함수종료
			return;
		}
		
		//사이즈를 3등분하여 최신화
		int newSize = size / 3;
		
        //3등분한 문자열의 2번째 부분 공백처리
		for(int i=start+newSize ; i<start+2*newSize ; i++) {
			sb.setCharAt(i, ' ');
		}
		
		//재귀적 호출
		func(start, newSize); //3등분 중 첫번째 부분
		func(start+2*newSize, newSize); //3등분 중 세번째 부분 
	}
    
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str;
		
		while ((str=br.readLine()) != null) {
			n = Integer.parseInt(str);
			
			sb =new StringBuilder();
			
			int len = (int) Math.pow(3, n);
			
            //'-'로 이루어진 문자열을 만들기
			for (int i=0 ; i<len ; i++) {
				sb.append("-");
			}
			
			//재귀함수 시작(func(시작 인덱스, 길이)
			func(0, len);
			
			System.out.println(sb);
		}
        
    }
}	
