import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        //학생 수 N 입력
		int N = Integer.parseInt(br.readLine());
        
		int box[][] = new int[3][2];
		boolean check = true;
		 
        //A, B, C학교 남학생 수, 여학생 수 입력
		for(int i=0 ; i<3 ; i++) {
			String tmp[] = br.readLine().split(" ");
            
			box[i][0] = Integer.parseInt(tmp[0]);
			box[i][1] = Integer.parseInt(tmp[1]);
		}

		for(int i=0 ; i<=box[0][0] ; i++) {
			int result[][] = new int[3][2];
            
			result[0][0] = i;
			result[0][1] = box[0][0] - i;
			result[1][1] = box[2][1] - result[0][1];
			result[1][0] = box[1][0] - result[1][1];
			result[2][0] = box[0][1] - result[1][0];
			result[2][1] = box[2][0] - result[2][0];
			 
			if(result[0][0]>=0 && result[0][1]>=0 && result[1][0]>=0 
               && result[1][1]>=0 && result[2][0]>=0 && result[2][1]>=0) {
				System.out.println(1);
				System.out.println(result[0][0]+" "+result[0][1]);
				System.out.println(result[1][0]+" "+result[1][1]);
				System.out.println(result[2][0]+" "+result[2][1]);
                
				check = false;
				break;
			}
			 
		}
		 
		if(check) {
			System.out.println(0);
		}
	}

}