import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
        
        //마력 X, 명령횟수 M 입력
        st = new StringTokenizer(br.readLine());
		int X = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
        
		int sum = X * (M+1);
		
		System.out.println(sum);
	}
}
