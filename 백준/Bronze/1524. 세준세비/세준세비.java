import java.util.*;
import java.io.*;

public class Main {	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
        
        //테스트케이스 개수 T 입력
        int T = Integer.parseInt(br.readLine());
		
		while(T-->0) {
			//테스트 케이스마다 빈 줄을 받을 변수 L
			String L = br.readLine();
            
            //N, M입력
			st = new StringTokenizer(br.readLine());            
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
            
			//세준 세비의 제일 강한 병사의 힘 저장변수
			int Smax = 0;
			int Bmax = 0;
			
			st = new StringTokenizer(br.readLine());
			for(int i=0 ; i<N ; i++) {
				int S = Integer.parseInt(st.nextToken());
				
                //최댓값 갱신
                Smax = Math.max(Smax, S);				
			}
			
			st = new StringTokenizer(br.readLine());
			for(int i=0 ; i<M ; i++) {
				int B = Integer.parseInt(st.nextToken());
				
                //최댓값 갱신
                Bmax = Math.max(Bmax, B);                
			}
			
			if(Smax > Bmax){
              System.out.println("S");  
            }else if(Bmax > Smax){
              System.out.println("B");  
            }else{
              System.out.println("S");  
            } 
		}
	}

}