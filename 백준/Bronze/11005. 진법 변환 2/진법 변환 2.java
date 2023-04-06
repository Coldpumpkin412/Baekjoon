import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		//활용할 리스트 선언
		List<Character> list = new ArrayList<>();
		
		//N,B선언
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		
		while(N>0) {
			if(N%B < 10) list.add((char)(N%B + '0'));
			else list.add((char)(N%B-10 + 'A'));
			
			N /= B;
		}
		
		//역순으로 출력
		for(int i=list.size()-1 ; i>=0 ; i--) {
			System.out.print(list.get(i));
		}
	}
}

	
