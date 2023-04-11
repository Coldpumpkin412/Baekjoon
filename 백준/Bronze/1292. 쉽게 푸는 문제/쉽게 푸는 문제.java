import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) {
		/*
		 * 최대 1000까지 나올수있으므로 배열에 미리 값을 할당해도 시간복잡도에 걸리지않는다.
		 */
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[1002];
		int count = 1;
		
		for(int i=1 ; i<=1000 ; i++) {
			for(int j=0 ; j<i ; j++) {
				
				if(count==1001) break;
				arr[count] = i;
				count++;
			}
		}
		
		int A = sc.nextInt();
		int B = sc.nextInt();
				
		int answer = 0;
		for(int i=A ; i<=B ; i++) answer += arr[i];
		
		System.out.println(answer);
	}
}

	
