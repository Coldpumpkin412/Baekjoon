import java.util.*;

public class Main {
    
    public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//초기화 및 선언
		int e=1,s=1,m=1;
		
		int E = sc.nextInt();
		int S = sc.nextInt();
		int M = sc.nextInt();
		
		for(int year=1 ;; year++){
			
			//년, 월, 일이 같으면 빠져나오기
			if(e==E && s==S && m==M) {
				System.out.println(year);
				break;
			}
			
			e++;
			s++;
			m++;
			
			//기준에 도달하면 다시 1로 초기화
			if(e==16) e=1;
			
			if(s==29) s=1;
			
			if(m==20) m=1;
		}
	
    }
}	
