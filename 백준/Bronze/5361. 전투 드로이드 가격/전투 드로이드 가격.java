import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
		int T = Integer.parseInt(br.readLine());
		
		while(T-->0) {
			st = new StringTokenizer(br.readLine());
			double A = Double.parseDouble(st.nextToken());
			double B = Double.parseDouble(st.nextToken());
			double C = Double.parseDouble(st.nextToken());
			double D = Double.parseDouble(st.nextToken());
			double E = Double.parseDouble(st.nextToken());
			
			double answer = (A * 350.34) + (B * 230.90) + (C * 190.55) + (D * 125.30) + (E * 180.90);
			
			System.out.println("$" + String.format("%.2f", answer));
		}
		
	}

}