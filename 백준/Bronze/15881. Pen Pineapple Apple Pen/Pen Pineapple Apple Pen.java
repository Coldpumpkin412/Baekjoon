import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	//물건개수 N 입력
    	int N = Integer.parseInt(br.readLine());
    	
    	//물건목록 입력
    	String str = br.readLine();
    	
    	//처음 길이
    	int length = str.length();
    	
    	//pPAp 변환
    	str = str.replace("pPAp", "");
    	
    	//없어진 길이를 4로 나눈것이 정답
    	System.out.println((length-str.length()) / 4);
    	
    }
}	
