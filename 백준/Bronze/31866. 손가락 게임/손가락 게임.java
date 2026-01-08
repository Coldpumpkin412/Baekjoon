import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        
        //준성 J, 익준 I 입력
        st = new StringTokenizer(br.readLine());
		int J = Integer.parseInt(st.nextToken());
		int I = Integer.parseInt(st.nextToken());
		
		if(J == 0){
			if(I == 5){ 
				sb.append("<");
			}else if(I == 0){  
				sb.append("=");
			}else{
				sb.append(">");
			}
		}else if(J == 2){ // 준성이가 찌일때
			if(I == 0){ // 익준이가 묵일때 
				sb.append("<");
			}else if(I == 2){ 
				sb.append("=");
			}else{ 
				sb.append(">");
			}
		}else if(J == 5){ 
			if(I == 2){ 
				sb.append("<");
			}else if(I == 5){  
				sb.append("=");
			}else{ 
				sb.append(">");
			}
		}else{ 
			if(I==0 || I==2 || I==5){
				sb.append("<");
			}else{
				sb.append("=");
			}
		}
		
		System.out.println(sb.toString());
	}
}
