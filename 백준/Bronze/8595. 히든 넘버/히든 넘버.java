import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
		br.readLine();
        
		long answer = 0;
        
		st = new StringTokenizer(br.readLine().replaceAll("[a-zA-Z]", " "));
		while(st.hasMoreTokens()){
            answer += Integer.parseInt(st.nextToken());
        }
			
		System.out.println(answer);
	}
}