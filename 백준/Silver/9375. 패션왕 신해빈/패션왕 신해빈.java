import java.util.*;
import java.util.HashMap;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//테스트 케이스 개수 입력
		int T = sc.nextInt();
		
		for(int i=0 ; i<T ; i++) {
			//옷의 개수, 종류 등 입력
			int N = sc.nextInt();
			HashMap<String, Integer> map = new HashMap<>();
			
			for(int j=0 ; j<N ; j++) {
				String clothes = sc.next();
				String kinds = sc.next(); 
				//옷의 종류를 활용하여 개수를 확인한다. 처음 들어오는 종류일 경우 getOrDefault활용하여 0을 반환
				map.put(kinds, map.getOrDefault(kinds, 0)+1);
			}
			
			//옷의 종류를 활용하여 조합의 수 확인(한종류만 입는 경우를 추가한다)
			
			Iterator<Integer> it = map.values().iterator();
			int answer=1;
			
			while(it.hasNext()) {
				answer *= it.next().intValue()+1; //안 입는 경우 추가
			}
			
			System.out.println(answer-1);
		}
	}
}