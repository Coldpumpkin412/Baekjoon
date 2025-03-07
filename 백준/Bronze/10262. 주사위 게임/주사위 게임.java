import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
        
        int Gunnar = 0;
        int Emma = 0;
		
		st = new StringTokenizer(br.readLine());
		for(int i=0 ; i<4 ; i++) {
			Gunnar += Integer.parseInt(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine());
		for(int i=0 ; i<4 ; i++) {
			Emma += Integer.parseInt(st.nextToken());
		}
		
		if(Gunnar > Emma) {
			System.out.println("Gunnar");
		}else if(Gunnar < Emma) {
			System.out.println("Emma");
		}else {
			System.out.println("Tie");
		}
	}

}