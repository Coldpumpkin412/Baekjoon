import java.util.*;
 
public class Main {
    //최대공약수 메소드
	static int gcd(int a, int b){
		int r;
 
		while(b != 0){
			r = a%b;
			a = b;
			b = r;
		}
        
		return a;
	}
 
	public static void main(String[] args) {
        /*
         * 유클리드호제법 이용하여 최대공약수 찾은 후 기약분수형태로 출력해주기
         */
		Scanner sc = new Scanner(System.in);
        
        //N입력
		int N = sc.nextInt();
 
		// 첫 번째 링
		int firstRing = sc.nextInt();
 
		for (int i=1 ; i<N ; i++) {
			int otherRing = sc.nextInt();
			
			//최대공약수 찾기
			int gcd = gcd(firstRing, otherRing);
 
			//분모와 분자를 최대공약수로 나눠주기(기약분수) 
            //이후에 출력
			System.out.println((firstRing/gcd) + "/" + (otherRing/gcd));
		}
	}
}