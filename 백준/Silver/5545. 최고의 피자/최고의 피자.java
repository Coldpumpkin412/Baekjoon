import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
        //토핑개수 N입력
		int N = sc.nextInt();
		
        //도우가격, 토핑가격, 도우칼로리 입력
		int doughPrice = sc.nextInt(); 
		int topPrice = sc.nextInt(); 
		int doughKCal = sc.nextInt();
        
        //토핑 칼로리리스트 배열선언(정렬을 위해 Integer로 선언)
		Integer[] Cal = new Integer[N]; 
        
        //토핑칼로리 입력
		for(int i=0 ; i<N ; i++){
            Cal[i] = sc.nextInt();
        }
			
		//도우의 칼로리당 가격
		int answer = doughKCal / doughPrice; 
		
        //내림차순 정렬
		Arrays.sort(Cal, Collections.reverseOrder());
		
		int tmpPrice = doughPrice;
		int tmpKCal = doughKCal;
        
		for(int i=0 ; i<N ; i++) {
			tmpPrice += topPrice;
			tmpKCal += Cal[i];
			int tmpAns =  tmpKCal / tmpPrice;
            
			if(answer > tmpAns) {
				break;
			}else {
				answer = tmpAns;
			}
		}
        
		System.out.println(answer);
	}
}