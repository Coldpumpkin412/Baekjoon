import java.util.*;


public class Main {
	public static int count; //리컬전 함수 카운팅 변수
	
	public static int recursion(String s, int l, int r){
		count++; //호출횟수 증가
		
        if(l >= r) return 1;
        else if(s.charAt(l) != s.charAt(r)) return 0;
        else return recursion(s, l+1, r-1);
    }
	
    public static int isPalindrome(String s){
        return recursion(s, 0, s.length()-1);
    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int i=0 ; i<T ; i++) {
			String s = sc.next();
			
			count=0; //호출횟수 초기화
			System.out.println(isPalindrome(s)+ " "+count);
		}
		
		sc.close();
	}
}
