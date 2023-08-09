import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
        //그리디 알고리즘 활용
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
        StringBuilder sb = new StringBuilder();
		
        //N, L 입력
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int L = Integer.parseInt(st.nextToken());
		
        //배열 선언
		int arr[] = new int[N];

        //배열각ㅄ 입력
		st = new StringTokenizer(br.readLine());
		for (int i=0 ; i<N ; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
        
        //오름차순 정렬
		Arrays.sort(arr);
        
		for (int i=0 ; i<N ; i++) {
			//배열값이 L보다 크면 빠져나오고 아니라면 L증가
            if(arr[i]>L) {
				break;
			}
			L++;
		}
		
		System.out.println(L);
	}
}