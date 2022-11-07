import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(); // 몇개의 단어 입력할 지 정함
		int count = 0 ; //그룹단어의 개수
		
		for(int i=0 ; i<N ; i++) {
			String S = sc.next(); //단어 입력
			boolean[] check = new boolean[26]; //알파벳별 사용 내역 저장 배열
			boolean group = true; // 그룹단어 확인용 변수
			
			for(int j=0 ; j<S.length() ; j++) {
				int index = S.charAt(j)-'a'; // 아스키코드 활용하여 정수로 변환
				if(check[index]) { //이전에 사용한 적 있으면 참으로 활용됨
					if(S.charAt(j) != S.charAt(j-1)) { //이전 문자와 다르다면
						group = false;
						break;
					}
				}
				else check[index] = true; //이전에 사용한적이 없다면
			}
			
			if(group) count++;
			
		}
		
		System.out.println(count);
		
	}

}
