import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        //테스트케이스 개수 T 입력
		int T = Integer.parseInt(br.readLine());
		
		while(T-->0) {
            //우주선 개수 N, 목적지까지 거리 D 입력 
			st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			double D = Double.parseDouble(st.nextToken());
            
			int count = 0;
			
			for(int i=0 ; i<N ; i++) {
                //우주선 최고속도 v, 연료양 f, 연료소비율 c 입력
				st = new StringTokenizer(br.readLine());
				double v = Double.parseDouble(st.nextToken());
				double f = Double.parseDouble(st.nextToken());
				double c = Double.parseDouble(st.nextToken());
				
				if((D/v)*c <= f) {
					count++;
				}
			}
            
			System.out.println(count);
		}
        
	}
}