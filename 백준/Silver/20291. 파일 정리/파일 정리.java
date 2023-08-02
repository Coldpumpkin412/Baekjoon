import java.util.*;
import java.io.*;

public class Main {
	
    public static void main(String[] args) throws IOException{
    	/*
    	 * 중복을 허용하지않으므로 해시셋 활용
    	 */    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	//해시맵 선언 (key : 확장자, value : 빈도)
    	Map<String, Integer> map = new HashMap<>();
    	
    	//파일의 개수 N입력
    	int N = Integer.parseInt(br.readLine());
    	
    	while(N-->0) {
    		//파일이름 입력
    		String str = br.readLine();
    		
    		//'.'을 기준으로 분해
    		String[] file = str.split("\\.");

    		//맵에 저장하여 빈도수 최신화
    		map.put(file[1], map.getOrDefault(file[1], 0)+1);
    	}
    	
    	//오름차순 정렬에 사용할 리스트 선언
    	List<String> list = new ArrayList<>(map.keySet());
    	
    	//오름차순 정렬
    	Collections.sort(list);
    	
    	//출력
    	for(String key : list) {
    		System.out.println(key + " " + map.get(key));
    	}
    	
    }
}	
