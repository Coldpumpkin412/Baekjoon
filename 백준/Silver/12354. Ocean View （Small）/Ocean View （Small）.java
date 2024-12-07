import java.util.*;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	int T = sc.nextInt();
    	
    	int count = 0;
    	
    	for(int i=0 ; i<T ; i++) {
    		int N = sc.nextInt();
    		int[] arr = new int[N];
    		
    		for(int j=0 ; j<N ; j++) {
    			arr[j] = sc.nextInt();    			
    		}
    		
    		for(int j=0 ; j<N-1 ; j++) {
    			if(arr[j] >= arr[j+1]) {
    				count++;
    			}
    		}
    		
    		System.out.println("Case #" + (i+1) + ": " + count);
    		
    		count = 0;
    	}
    }
}