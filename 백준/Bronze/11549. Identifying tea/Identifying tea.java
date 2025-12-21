import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
		int T = sc.nextInt(); 
		int[] arr = new int[5];
        
        int count = 0;

		for(int i=0 ; i<arr.length ; i++) {
			arr[i] = sc.nextInt();
            
            if(arr[i] == T) {
				count++;
			}
		}

		System.out.println(count);
        
	}
}