import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        //무게 K 입력
		long K = Long.parseLong(br.readLine());
        
		int count = 0;

		for(int i=2 ; i<=K ; i++) {
			if(i >= 1000000) {
				sb.append(K);
				count++;
				break;
			}

			while(K%i == 0) {
				K /= i;
				count++;
                
				sb.append(i).append(" ");
			}
		}

        System.out.println(count);
		System.out.println(sb.toString());
	}
}