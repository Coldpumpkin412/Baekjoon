import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int sum = 0;
		int res = 0;
        
		for(int i=0 ; i<10 ; i++) {
			int num = Integer.parseInt(br.readLine());
            
			if(sum<100){
				sum += num;
                
				if(Math.abs(res-100)>Math.abs(sum-100)) {
					res = sum;
				}else if(Math.abs(res-100)==Math.abs(sum-100)) {
					res = res>sum ? res : sum;
				}
			}
		}
        
		System.out.println(res);
	}
}