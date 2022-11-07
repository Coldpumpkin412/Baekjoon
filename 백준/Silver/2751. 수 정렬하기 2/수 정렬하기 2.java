import java.util.Scanner;
import java.util.Collections; 
import java.util.ArrayList;

public class Main { 
	//Arrays.sort(정렬함수) 이용한 정렬을 사용하면 시간초과 가능성
	//시간복잡도가 최악의 경우 O(n^2)
	//그러므로 Collections.sort()를 사용(시간복잡도 : O(n)~O(nlogn)

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		//StrungBuilder는 String과 문자열을 더할때 기존의 데이터에 더하는방식
		//속도가 빠르고 부하가 적다.
		
		int N = sc.nextInt(); //몇개의 수를 입력할 지 입력
		
		ArrayList<Integer> list = new ArrayList<>();
		//Collections.sort()는 일반적인 배열이 아닌 리스트를 이용해야한다
		//자동으로 부족한 크기의 용량만큼 늘어난다
		
		for(int i=0 ; i<N ; i++) {
			list.add(sc.nextInt()); //ArrayList 활용하여 입력값 배열에 저장
		}
		
		Collections.sort(list); //오름차순 정렬(ArrayList 사용필수)
		
		//System.out 을 이용하면 시간초과
		//StringBuild 변수를 이용하여 한 번에 출력
		for(int number : list) {
			sb.append(number).append("\n");
		}

		
		System.out.println(sb);
	}
}
