import java.util.*;
import java.io.*;

public class Main {

	static char[] alphabet = new char[27];
    
    //방문처리 배열
	static boolean[] visited;
	static int answer = 0;
	
	public static void DFS(int index, String tmp, int length) {
		
		if(index == length) {
			answer++;
			return;
		}
		
		for(int i=0 ; i<26 ; i++) {
			if(alphabet[i] == 0){
                continue;
            }
				
			if(tmp!="" && tmp.charAt(tmp.length()-1) == (char)('a'+i)) {
                continue;
            }
				
			alphabet[i]--;
            //재귀호출
			DFS(index+1, tmp + (char)('a' + i), length);
			alphabet[i]++;
		}
	}
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		for(int i=0 ; i<str.length() ; i++) {
            alphabet[str.charAt(i) - 'a']++;
        }
        //DFS 함수
		DFS(0, "", str.length());
		
		System.out.println(answer);
	}
}