import java.util.*;
import java.io.*;

public class Main {
	
	//라스칼 삼각형 함수
	static int Rascal(int row, int col) {
		//등차수열 공식 변환
		return (row-col)*col + 1;
	}
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st;
    	StringBuilder sb = new StringBuilder();
    	        
    	//테스트케이스 개수 T 입력
    	int T =Integer.parseInt(br.readLine());
    	        
    	while(T-->0) {
    	//숫자 N, M 입력
    	st = new StringTokenizer(br.readLine());
    	int N = Integer.parseInt(st.nextToken());
    	int M =Integer.parseInt(st.nextToken());
    	
    	//라스칼 삼각형 값 결과값에 저장
    	sb.append(Integer.toString(Rascal(N, M))).append("\n");
    	
    	}
    	             
    	System.out.println(sb.toString());
    }
}	
