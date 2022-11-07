import java.util.Scanner;

public class Main{
    	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int Min=1000000, Max=-1000000;
		int[] arr = new int[N];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
			if(arr[i] > Max) Max = arr[i];
			if(arr[i] < Min) Min = arr[i];
		}
		System.out.println(Min+" "+Max);
	}
}