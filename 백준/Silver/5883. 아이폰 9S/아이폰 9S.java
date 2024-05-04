import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
        
        //N 입력
		int N = Integer.parseInt(br.readLine());
        
        //활용할 해시셋 및 배열 선언
		Set<Integer> set = new HashSet<>();
		int arr[] = new int[N];
        
        //각 사람이 원하는 용량을 배열, 해시셋에 넣어주기
		for(int i=0 ; i<N ; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			set.add(arr[i]);
		}
        
		int answer = 1;
        
        //해시셋에 들어있는 용량들
		for(int number : set) {
			int count = 1;
            
			int pre = arr[0];
            
			for(int i=1 ; i<N ; i++) {
				if(arr[i] == number) {
                    continue;	
                }
                
				if(pre != arr[i]) {
					count = 1;
				}else {
					count++;
                    
                    //최댓값으로 갱신
					answer = Math.max(answer, count);
				}
				pre = arr[i];
			}
		}
        
		System.out.println(answer);
	}
}