import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{        
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        //샌드위치 가격 S, 가지고 있는 금액 M 입력
        st = new StringTokenizer(br.readLine());
		int S = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
        
		if(S < 1024) {
			System.out.println("No thanks");
		}else {
			int needMoney = S-1023;
			int borrowMoney = M;
            
			if((needMoney&borrowMoney) == needMoney) {
				System.out.println("Thanks");
			}else{
				System.out.println("Impossible");
			}
		}
        
	}
}