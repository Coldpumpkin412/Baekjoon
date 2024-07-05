import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st;
        
        //방의 세로길이 R, 가로길이 C 입력
		st = new StringTokenizer(br.readLine());
		int R = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		
        //Rg, Cg, Rp, Cp 입력 (answer = Rp*Cp)
		st = new StringTokenizer(br.readLine());
        int Rg = Integer.parseInt(st.nextToken());
		int Cg = Integer.parseInt(st.nextToken());
		int answer = Integer.parseInt(st.nextToken()) * Integer.parseInt(st.nextToken());
		
		while(R-->0){
			for(char ch : br.readLine().toCharArray()) {
				if(ch == 'P') {
					answer--;
				}
			}
		}
        
		System.out.print(answer!=0 ? 1 : 0);
	}
}