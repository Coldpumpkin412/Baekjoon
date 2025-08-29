import java.util.*;

public class Main {	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int count = 0;
		
		for(int i=0 ; i<=N ;i++) {
			int index = i;
			while(index != 0) {
				if(index%10==3 || index%10==6 || index%10==9) {
					count += 1;
				}
                
				index /= 10;
			}
		}
		System.out.println(count);
    }
}