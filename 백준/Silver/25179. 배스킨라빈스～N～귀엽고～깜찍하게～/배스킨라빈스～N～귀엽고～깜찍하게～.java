import java.util.*;
import java.io.*;

public class Main {
 	public static void main(String arg[]) throws IOException {
 		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 		StringTokenizer st;
        
        st = new StringTokenizer(br.readLine());
 		long N = Long.parseLong(st.nextToken());
 		long M = Long.parseLong(st.nextToken());
        
        //나머지값 확인 후 결과 출력        
        System.out.println( ((N-1)%(M+1)==0) ? "Can't win" : "Can win");
 	}
}