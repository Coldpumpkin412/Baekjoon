import java.util.*;
import java.io.*;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
		
        //N, M 입력
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
        //문자열 두개 빈것으로 선언
        String str1 = "";
        String str2 = "";
        
		for(int i=0 ; i<N ;i++){
          str1 += br.readLine();  
        } 
		for(int i=0 ; i<N ; i++){
          str2 += br.readLine();  
        } 
        
		boolean check = false;
		for(int i=0 ; i<N*M*2 ; i++){
          if(str2.charAt(i) != str1.charAt(i/2)) {
			check = true;
			break;
		  }  
        } 
        
		System.out.println(check ? "Not Eyfa" : "Eyfa");
	}
}