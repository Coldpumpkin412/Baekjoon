import java.util.*;
import java.io.*;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        //N입력
		int N = Integer.parseInt(br.readLine());
        
		int answer = 0;
		int num = 1;
		int index = 10;
        
		for (int i=1 ; i<=N ; i++) {
            //10을기준으로
			if (i%index == 0) {
				num += 1;
				index *= 10;
			}
			answer += num;
		}
		System.out.println(answer);
	}
}