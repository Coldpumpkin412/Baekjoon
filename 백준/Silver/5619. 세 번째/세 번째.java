import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
        
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		        
        //수의 개수 N 입력
		int N = Integer.parseInt(br.readLine()); 
	
        //배열선언 및 값 입력
		int[] num = new int[N];
		for(int i=0 ; i<N ; i++) {
			num[i] = Integer.parseInt(br.readLine());
		}
		
        //오름차순 정렬
		Arrays.sort(num);   
				
		int[] answer = new int[6];

		int index = 0;
		for(int i=0 ; i<N ; i++) {
			for(int j=i+1 ; j<N ; j++) {
				if(index == 6) {
                    break;
                }
                
				answer[index++] = Integer.parseInt(num[i]+""+num[j]);
				answer[index++] = Integer.parseInt(num[j]+""+num[i]);
			}
		}

        //오름차순 정렬
		Arrays.sort(answer);
		
		System.out.println(answer[2]);
		
	}		
}