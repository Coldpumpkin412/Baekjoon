import java.util.*;
import java.io.*;

public class Main {
    //로또함수
	public static boolean Lotto(int N, String str) {
		int count = 1;
        
		for(int i=1 ; i<N ; i++) {
			char ch = str.charAt(i);
            
			char before = str.charAt(i-1);
            
			if(ch-before==1 || before-ch==1) {
				count++;
                
				if(count == 5) {
                    return true;
                }
			}else {
				count = 1;
			}
		}
		return false;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
        int N = Integer.parseInt(br.readLine());
		String str = br.readLine();
        
		System.out.println(Lotto(N, str) ? "YES" : "NO");
	}
}