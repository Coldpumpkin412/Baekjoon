import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        //A 입력
        
		int A = Integer.parseInt(br.readLine());

		for (int i=1 ; i<=A ; i++) {
            //i+1이 30의 약수인 경우
			if (30%(i+1) == 0) {
				sb.append(i + "\n");
			}
		}

		System.out.println(sb.toString());
	}

}