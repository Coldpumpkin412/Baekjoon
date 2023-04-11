import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//초기 조각에 쓰여진 수 입력
		int[] arr = new int[5];
		for(int i=0 ; i<5 ; i++) {
			arr[i] = sc.nextInt();
		}
		
		//12345 순서가 될때까지 반복
		while(arr[0]!=1 || arr[1]!=2 || arr[2]!=3 || arr[3]!=4 || arr[4]!=5) {
			int tmp;
			
			if(arr[0] > arr[1]) {
				tmp = arr[1];
				arr[1] = arr[0];
				arr[0] = tmp;
				
				System.out.println(arr[0]+" "+arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]);
			}
			
			if(arr[1] > arr[2]) {
				tmp = arr[2];
				arr[2] = arr[1];
				arr[1] = tmp;
				
				System.out.println(arr[0]+" "+arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]);
			}
			
			if(arr[2] > arr[3]) {
				tmp = arr[3];
				arr[3] = arr[2];
				arr[2] = tmp;
				
				System.out.println(arr[0]+" "+arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]);
			}
			
			if(arr[3] > arr[4]) {
				tmp = arr[4];
				arr[4] = arr[3];
				arr[3] = tmp;
				
				System.out.println(arr[0]+" "+arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]);
			}
		}
	}
}

	
