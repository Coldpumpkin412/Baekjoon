import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
        //빨대 개수 N 입력
		int N = Integer.parseInt(br.readLine());
        
        //정렬을 위해 Integer형으로 선언(빨대길이 배열)
		Integer arr[] = new Integer[N];
		
        //배열 값 입력
		for(int i=0 ; i<N ; i++) {
			arr[i]=Integer.parseInt(br.readLine());
		}
		
		int max = 0;
        
        //내림차순 정렬
		Arrays.sort(arr,Collections.reverseOrder());
		
		for(int i=0 ; i<N-2 ; i++) {
			if(arr[i] < arr[i+1]+arr[i+2]) {
                //최댓값 갱신
				max = Math.max(max, arr[i]+arr[i+1]+arr[i+2]);
			}
		}
        
        System.out.println(max==0 ? "-1" : max);
	}
}