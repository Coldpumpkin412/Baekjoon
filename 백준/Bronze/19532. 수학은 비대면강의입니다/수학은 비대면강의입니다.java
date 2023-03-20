import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException{
		/*
		 * 방정식을 만족하는 해의 쌍(x,y)의 범위가 -999~999 (약 2천개)
		 * 즉, 모든 경우의 수를 전부 확인하여 풀어도 시간복잡도가 시간제한을 넘지 않는다.
		 * 완전탐색(브루트포스)를 활용하여 풀기
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		int d = Integer.parseInt(st.nextToken());
		int e = Integer.parseInt(st.nextToken());
		int f = Integer.parseInt(st.nextToken());
		
		for(int i=-999 ; i<=999 ; i++) {
			for(int j=-999 ; j<=999 ; j++) {
				if((a*i + b*j == c) && (d*i + e*j ==f)) {
					System.out.println(i+" "+j);
				}
			}
		}
		
	}
}

