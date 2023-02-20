import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		
		for(int i=0 ; i<N/4 ; i++) {
			sb.append("long "); //4로 나눈 몫만큼 long과 공백 붙여주기
		}
        //마지막에 int 붙인 후 출력
		sb.append("int");
		
		System.out.println(sb.toString());
		
	}
}

	