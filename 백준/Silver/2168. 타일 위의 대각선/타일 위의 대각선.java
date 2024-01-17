import java.util.*;
import java.io.*;

public class Main {
	
	//유클리드 호제법을 활용한 최대공약수 구하는 GCD 함수
	public static int GCD(int a, int b) {
		return b==0 ? a : GCD(b, a%b);
	}
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st;
    	
    	//가로길이x, 세로길이y 입력
    	st = new StringTokenizer(br.readLine());
    	int x = Integer.parseInt(st.nextToken());
    	int y = Integer.parseInt(st.nextToken());
    	
    	//대각선이 지나가는 1x1 크기 정사각형 타일의 개수는 
    	//x+y-(x와 y의 최대공약수) 라는 점화식을 통해 정답 구하기
    	System.out.println(x+y - GCD(x, y));
    	
    }
}	
