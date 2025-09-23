import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine(), ":");
		int H1 = Integer.parseInt(st.nextToken());
		int M1 = Integer.parseInt(st.nextToken());
		int S1 = Integer.parseInt(st.nextToken());
		
		int now = 3600*H1 + 60*M1 + S1;
		
		st = new StringTokenizer(br.readLine(), ":");
		int H2 = Integer.parseInt(st.nextToken());
		int M2 = Integer.parseInt(st.nextToken());
		int S2 = Integer.parseInt(st.nextToken());
		
		int start = 3600*H2 + 60*M2 + S2;
		
		int time = 0;
		
		if(start > now) {
			time = start - now;
		}else {
			time = 24*3600 - (now-start);
		}
		
		System.out.format("%02d:%02d:%02d", (time / 3600), ((time / 60) % 60), (time % 60));
	}
}