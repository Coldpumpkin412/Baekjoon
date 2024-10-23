import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
        //빨강, 갈색 입력
		int R = sc.nextInt();	
		int B = sc.nextInt();	
		int L = 0;
		int W = 0;
        
        int max = 5000;
        int max2 = 4000;

		for(int i=1 ; i<=max ; i++) {
			for(int j=1 ; j<=max2 ; j++) {
				if(R+B == i*j) {
					if(R == (2*i)+2*(j-2)) {
						L = i;
						W = j;
                        
						break;
					}else if(R == (2*j)+2*(i-2)) {
						L = j;
						W = i;
                        
						break;
					}
				}
			}
		}

		System.out.println(L + " " + W);	
	}
}