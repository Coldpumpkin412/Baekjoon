import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
        //알파벳별 횟수 저장 배열 선언
		int[] alpabet = {3, 2, 1, 2, 3, 3, 2, 3, 3, 2, 2, 1, 2, 2, 1, 2, 2, 2, 1, 2, 1, 1, 1, 2, 2, 1};
		
        //이름 두 개 입력
		String first = sc.nextLine();
		String second = sc.nextLine();
		
		int[] arr = new int[first.length() + second.length()];
		 
        for (int i=0 ; i<arr.length-1 ; i+=2) {
            //아스키 코드 활용하여 배열에 값 넣어주기
        	arr[i]   = alpabet[first.charAt(i/2) - 65];
            arr[i+1] = alpabet[second.charAt(i/2) - 65];
        }
        
        int size = arr.length;
        
        while (size>2) {
            //배열값 갱신
            for (int i=0 ; i<size-1 ; i++) {
            	arr[i] = (arr[i] + arr[i+1])%10;
            }
            arr[--size] = 0;
        }
 
        System.out.println(Integer.toString(arr[0])+Integer.toString(arr[1]));
	}
}