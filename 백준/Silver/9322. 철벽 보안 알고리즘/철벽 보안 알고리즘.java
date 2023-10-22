import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
        
        //테스트케이스 개수 T 입력
		int T = Integer.parseInt(br.readLine());
        
		while(T-->0) {
			//한 문장의 단어 수 입력
			int N = Integer.parseInt(br.readLine());
            
            //해시맵 선언
			HashMap<String, Integer> map = new HashMap<>();
            
            //제 1 공개키
			int nomal[] = new int[N];
			st = new StringTokenizer(br.readLine());
			for(int i=0 ; i<N ; i++) {
				String key = st.nextToken();
                
                //해시맵에 넣기
				map.put(key, i);
			}
            
            //제 2 공개키
			st = new StringTokenizer(br.readLine());
			for(int i=0 ; i<N ; i++) {
				String key = st.nextToken();
                
				nomal[i] = map.get(key);
			}
            
            //암호문
			st = new StringTokenizer(br.readLine());
			String str[] = new String[N];
            
			for(int i=0 ; i<N ; i++) {
				str[nomal[i]] = st.nextToken();
			}
            
			for(int i=0 ; i<N ; i++) {
				System.out.print(str[i]+" ");
			}
            
			System.out.println();
		}
	}
}