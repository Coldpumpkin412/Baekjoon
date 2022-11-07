import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String word = sc.next(); //전화기 돌릴 단어 입력
		int count = 0; //걸리는 시간 계산
		
		for(int i=0 ; i<word.length() ; i++) {
			
			switch(word.charAt(i)) {
			
			case 'A': case 'B': case 'C' :
				count += 3;
				break;
			case 'D' : case 'E': case 'F' :
				count += 4; 
				break;
                
			case 'G' : case 'H': case 'I' :
				count += 5; 
				break;
                
			case 'J' : case 'K': case 'L' : 
				count += 6;
				break;
                
			case 'M' : case 'N': case 'O' :
				count += 7;
				break;
                
			case 'P' : case 'Q': case 'R' : case 'S' : 
				count += 8; 
				break;
                
			case 'T' : case 'U': case 'V' : 
				count += 9;
				break;
                
			case 'W' : case 'X': case 'Y' : case 'Z' : 
				count += 10;
				break;
			}
		}		
		System.out.print(count);
	}
}