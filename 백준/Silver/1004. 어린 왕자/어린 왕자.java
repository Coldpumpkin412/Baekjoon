import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException{		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
        
        //테스트케이스 개수 T 입력
		int T = Integer.parseInt(br.readLine());
		
		while(T-->0) {
			st = new StringTokenizer(br.readLine());
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			
			int N = Integer.parseInt(br.readLine());
			
			int answer=0;
			
			
			for(int i=0 ; i<N ; i++) {
				st = new StringTokenizer(br.readLine());
				int x = Integer.parseInt(st.nextToken());
				int y = Integer.parseInt(st.nextToken());
				int r = Integer.parseInt(st.nextToken());
				
				//시작점이 행성 안에 있는지 확인
				boolean flag1 = false;
				//도착점이 행성 안에 있는지 확인
				boolean flag2 = false;
				
				if(Math.pow(x1-x, 2)+Math.pow(y1-y, 2)>Math.pow(r, 2)){
                  flag1 = true;  
                } 
				if(Math.pow(x2-x, 2)+Math.pow(y2-y, 2)>Math.pow(r, 2)) {
                    flag2 = true;
                }
							
				if(flag1!=flag2) {
                    answer++;
                }
			}
			
			System.out.println(answer);
		}
	}

}
