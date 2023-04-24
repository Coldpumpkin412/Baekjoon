import java.util.*;

public class Main{
    //유클리드 호제법을 활용하여 최대공약수 구하기
	public static int gcd(int a, int b) {
		if(b==0) return a;
        
		return gcd(b, a%b);
	}
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
		int T = sc.nextInt();
        
		for (int i=0 ; i<T ; i++) {
            //범위를 벗어날 수 있기때문에 long형으로 선언
            long sum = 0;
            
			int N = sc.nextInt();
            
			int[] arr = new int[N];
            
			for(int j=0 ; j<N ; j++) {
				arr[j] = sc.nextInt();
			}
			
			for(int j=0 ; j<N ; j++) {
				for(int k=j ; k<N ; k++) {
					if(k!=j) {
						sum += gcd(arr[j], arr[k]);
					}
				}
			}
			System.out.println(sum);
		}
	}
	
	
}