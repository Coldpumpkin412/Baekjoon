import java.util.Scanner;

public class Main{
    		public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int[] arr = new int[9];
		int Max=0,Index=0;
		int i;
		
		for(i=0 ; i<arr.length ; i++) {
			arr[i] = sc.nextInt();
			if(arr[i] > Max) {
				Max = arr[i];
				Index = i+1;
			}
		}
		
		System.out.println(Max+"\n"+Index);	
	}
}