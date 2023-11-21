import java.util.*;
import java.io.*;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        int i;
        
		//CPT 회원 수 N 입력
		int N = Integer.parseInt(br.readLine());
        
        //참가한 팀의 수 M 입력 및 K 입력
		st = new StringTokenizer(br.readLine());
		int M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        
		M *= K;
        
        //내림차순 정렬을 위해 Integer로 선언
		Integer[] arr = new Integer[N];
        
        //가지고있는 펜의 수 입력
		st = new StringTokenizer(br.readLine());
		for(i=0 ; i<N ; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        } 
        
        //내림차순 정렬
		Arrays.sort(arr, Collections.reverseOrder());
        
		for(i=0 ; i<N ;i++) {
			M -= arr[i];
            
            //펜이 다 떨어지면
			if(M<=0) {
                break;
            }
		}
        
		System.out.println(i==N ? "STRESS" : (i+1));
	}
}