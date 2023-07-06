import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args) throws NumberFormatException, IOException {
        /*
         * 다이나믹프로그래밍 활용하여 풀기
         * 문자열 두개를 각 글자로 쪼개서 배열을 만들어 규칙 먼저 찾아보기(LCS유형)
         * LCS길이는 이전과 같은 길이로 나열되지만 기준인덱스와 같은 글자를 만나면 1이 늘어남.
         */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str1 = br.readLine();
		int l1 = str1.length();
		String str2 = br.readLine();
		int l2 = str2.length();
		
        //다이나믹 프로그래밍에 활용될 배열
		int[][] dp = new int[l2+1][l1+1];
		
		for(int i=1 ; i<=l2 ; i++) {
			//기준이 되는 단어
            char C = str2.charAt(i-1);
            
			for(int j=1 ; j<=l1 ; j++) {
                //기준 단어를 만났을 때
				if(C == str1.charAt(j-1)) {
					dp[i][j] = dp[i-1][j-1] + 1;
				}else {
					dp[i][j] = Math.max(dp[i][j-1], dp[i-1][j]);
				}
			}
		}
		System.out.println(dp[l2][l1]);
	}
}
