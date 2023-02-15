import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine()); //회원 수 입력
		String[][] arr = new String[N][2];
		
		for(int i=0 ; i<N ; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			arr[i][0] = st.nextToken(); //나이 입력
			arr[i][1] = st.nextToken(); //이름 입력
		}
		
		//Comparator 활용한 정렬
		Arrays.sort(arr, new Comparator<String[]>() {
			public int compare(String[] str1, String[] str2) {
				//나이 순으로 정렬
				return Integer.parseInt(str1[0]) - Integer.parseInt(str2[0]);
			}
		});
		
		for(int i=0 ; i<N ; i++) System.out.println(arr[i][0]+" "+arr[i][1]);
	}
}