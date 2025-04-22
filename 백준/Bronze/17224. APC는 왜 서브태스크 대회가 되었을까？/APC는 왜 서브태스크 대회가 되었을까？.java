import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
        
        //문제 개수 N, 역량 L, 풀수있는 쵣 개수 K 입력
        st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int L = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());

		int easy = 0;
		int hard = 0;

		for(int i=0 ; i<N ; i++){
            //쉬운버전 난이도 sub1, 어려운버전 난이도 sub2 입력
			st = new StringTokenizer(br.readLine());
			int sub1 = Integer.parseInt(st.nextToken());
			int sub2 = Integer.parseInt(st.nextToken());

			if(L >= sub2){
				hard++;
			}else if(L >= sub1) {
				easy++;
			}
		}

		int answer = Math.min(K, hard) * 140;

		if(hard < K) {
			answer += Math.min(K-hard, easy) * 100;
		}

		System.out.println(answer);
	}

}