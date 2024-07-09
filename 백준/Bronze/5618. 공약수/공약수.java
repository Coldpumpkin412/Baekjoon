import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
        //자연수 개수 N 입력
		int N = Integer.parseInt(br.readLine());
        
        //자연수 저장 배열 선언
		int[] arr = new int[N];
		
        //자연수 입력
		st = new StringTokenizer(br.readLine());
		for(int i= 0; i<N ; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
			
        //오름차순 정렬
		Arrays.sort(arr);
		
		for(int i=1 ; i<=arr[0] ; i++) {
			int count = 0;
			
			//공약수 찾기 
			for(int j=0 ; j<N ; j++) {
				if(arr[j]%i == 0) {
                    count ++;
                }
			}
			
			//주어진 자연수가 모두 i로 나누어떨어질때
			if(count == N) {
                System.out.println(i);
            }
		}
	}
}