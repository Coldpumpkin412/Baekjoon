import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;        
		StringBuilder sb = new StringBuilder();
        
        //가로, 세로 입력
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()); 
		int M = Integer.parseInt(st.nextToken()); 
		
		
		st = new StringTokenizer(br.readLine());
		int startx = Integer.parseInt(st.nextToken());
		int starty = Integer.parseInt(st.nextToken());
		boolean sbx = startx%2==0 ? true : false;
		boolean sby = starty%2==0 ? true : false;
		
		st = new StringTokenizer(br.readLine());
		int endx = Integer.parseInt(st.nextToken());
		int endy = Integer.parseInt(st.nextToken());
        
		boolean ebx = endx%2==0 ? true : false;
		boolean eby = endy%2==0 ? true : false;
		
		if(N==1 || M==1) {
			if (startx==endx && starty==endy) {
				sb.append("YES");
			}else {
				sb.append("NO");
			}
		}else if(sbx!=sby && ebx!=eby) {
			sb.append("YES");
		}else if(sbx==sby && ebx==eby) {
			sb.append("YES");
		}else {
			sb.append("NO");
		}
		
		System.out.println(sb.toString());
	}
}
