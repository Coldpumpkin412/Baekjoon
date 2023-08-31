import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
        //정규식을 활용하여 간단하게 풀기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
        
        //테스트케이스 개수 T 입력
		int T = Integer.parseInt(br.readLine());
		
        //시작이 A~F + 이후에 A,F,C가 하나 이상 + 이후에 A~F가 0 or 1개
		String str = "[A-F]?A+F+C+[A-F]?$";
		
		while(T-->0) {
            //삼항연산자 활용하여 한 줄로 표기
			sb.append(br.readLine().matches(str) ? "Infected!" : "Good").append("\n");
		}
		System.out.print(sb);
	}
}