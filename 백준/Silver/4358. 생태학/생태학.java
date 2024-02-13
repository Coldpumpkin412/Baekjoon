import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st;
    	
    	//해시맵 선언(key : 나무이름, value : 빈도 수)
    	Map<String, Integer> map = new HashMap<>();
    	
    	String tree = "";
    	
    	//전체 나무 수
    	double total = 0;
    	
    	//입력이 빈문장이 아닐때까지
    	while((tree=br.readLine()) != null) {
    		//맵에 존재하면 빈도수 증가, 아니라면 새로 추가
    		map.put(tree, map.getOrDefault(tree, 0)+1);
    		
    		total++;
    	}
    	
    	//리스트에 해시맵 키들 저장
    	List<String> list = new ArrayList<>(map.keySet());
    	
    	//오름차순 정렬
    	Collections.sort(list);
    	
        //출력
    	for(String key : list) {
    		System.out.print(key + " ");
            //소수점 4자리까지
    		System.out.println(String.format("%.4f", ((double)map.get(key)/total) * 100));
    	}
    }
}	
