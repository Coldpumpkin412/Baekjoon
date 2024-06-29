import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        
        //d1, d2, x 입력        
        st = new StringTokenizer(br.readLine());        
		int d1 = Integer.parseInt(st.nextToken());
		int d2 = Integer.parseInt(st.nextToken());
		int X = Integer.parseInt(st.nextToken());
        
		int max = Math.max(d1, d2);
		int min = Math.min(d1, d2);
        
		double m = 100-X;
		double v = m/min;
        
		m = X;
		v += m/max;
        
		System.out.println(100/v);
	}
}