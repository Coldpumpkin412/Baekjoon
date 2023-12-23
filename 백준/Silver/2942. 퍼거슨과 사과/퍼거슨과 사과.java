import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
        
        //빨간사과 개수 R, 초록사과 개수 G 입력
        st = new StringTokenizer(br.readLine());
		int R = Integer.parseInt(st.nextToken());
		int G = Integer.parseInt(st.nextToken());
        
        //선수 수 초기값 설정
		int player = 1;
		
        //선수가 둘의 사과중 적은 사과의 갯수보다 작거나 같을때까지만 반복
		while(player<=R || player<=G) {
			
            //사과를 선수 수로 나눴을때 둘 다 0인경우
			if(R%player==0 && G%player==0) {
				System.out.println(player+" "+R/player+" "+G/player);			
			}
            
            //선수 추가
			player++;
		}
    }
}