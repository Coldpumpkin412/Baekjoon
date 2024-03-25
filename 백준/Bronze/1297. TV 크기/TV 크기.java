import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;		
        
        //빗변, 너비, 높이 입력
        st = new StringTokenizer(br.readLine());
		double D = Double.parseDouble(st.nextToken());
		double H = Double.parseDouble(st.nextToken());
		double W = Double.parseDouble(st.nextToken());		
		
		double pow = Math.pow(D, 2) / (Math.pow(H, 2) + Math.pow(W, 2));
		double sqrt = Math.sqrt(pow);
		        
		System.out.println((int) (sqrt * H) + " " + (int) (sqrt * W));
	}

}