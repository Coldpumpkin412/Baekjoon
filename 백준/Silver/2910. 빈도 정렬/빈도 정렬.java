import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st;
    	StringBuilder sb = new StringBuilder();
    	
    	//메시지 길이 N, C 입력
    	st = new StringTokenizer(br.readLine());
    	int N = Integer.parseInt(st.nextToken());
    	int C = Integer.parseInt(st.nextToken());
    	
    	//메시지 수열 입력시 빈도수를 저장할 해시맵 선언(입력순서를 지키기위해 LinkedHashMap으로 선언)
    	Map<Integer, Integer> map = new LinkedHashMap<>();
    	
    	//값 입력 및 빈도수 최신화
    	st = new StringTokenizer(br.readLine());
    	for(int i=0 ; i<N ; i++) {
    		int number = Integer.parseInt(st.nextToken());
    		map.put(number, map.getOrDefault(number, 0)+1);
    	}
    	
    	//입력됐던 key 모두 리스트에 저장
    	List<Integer> list = new ArrayList<>(map.keySet());
    	
    	//빈도수를 기준으로 list 내림차순 정렬
    	Collections.sort(list, new Comparator<Integer>() {
    		@Override
    		public int compare(Integer o1, Integer o2) {
    			return Integer.compare(map.get(o2), map.get(o1));
    		}
    	});
    	
    	//내림차순으로 정렬된 key 리스트 들을 해당 빈도수 만큼 출력
    	Iterator<Integer> it = list.iterator();
    	
    	while(it.hasNext()) {
    		Integer element = it.next();
    		
    		for(int i=0 ; i<map.get(element) ; i++) {
    			sb.append(element).append(" ");
    		}
    	}
    	
    	System.out.println(sb.toString());
    }
}	
