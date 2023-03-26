import java.util.*;
import java.io.*;	

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//하얀칸에 말이 있는 경우의 수
		int count = 0;
		
		//체스판은 8x8로 고정
		for(int i=0 ; i<8 ; i++) {
			String str = br.readLine();
			
			for(int j=0 ; j<8 ; j++) {
				//말이 있으면서 흰색칸인 경우
				if(str.charAt(j)=='F' && (i+j)%2==0) {
					count++;
				}
			}
		}
		
		System.out.println(count);
	}
}

	
