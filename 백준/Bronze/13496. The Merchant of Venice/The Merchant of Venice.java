import java.util.*;

public class Main {
	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		
		int K = sc.nextInt();
		
		for(int i=0 ; i<K ; i++) {
			int N = sc.nextInt();
			int S = sc.nextInt();
			int D = sc.nextInt();
            
			int[] a = new int[N];
			int[] b = new int[N];
            
			int total = 0;
            
			for(int j=0 ; j<a.length ; j++) {
				a[j] = sc.nextInt();
				b[j] = sc.nextInt();
                
				if(S*D >= a[j]) {
					total += b[j];
				}
			}
			
			System.out.println("Data Set " + (i + 1) + ":");
			System.out.println(total);
			System.out.println();
		}
		
	}
}