import java.util.*;
import java.io.*;

public class Main {
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st;
    	StringBuilder sb = new StringBuilder();
    	
    	//걸그룹 수 N, 맞혀야하는 문제 수 M 입력
    	st = new StringTokenizer(br.readLine());
    	int N = Integer.parseInt(st.nextToken());
    	int M = Integer.parseInt(st.nextToken());
    	
    	//해시맵 선언(key : 그룹이름, value : 멤버들 현황)
    	Map<String, List<String>> map = new HashMap<>();
    	
    	while(N-->0) {
    		//그룹이름 입력
    		String group = br.readLine();
    		
    		//멤버 수 입력
    		int number = Integer.parseInt(br.readLine());
    		
    		List<String> list = new ArrayList<>();
    		
    		//멤버 이름 입력
    		for(int i=0 ; i<number ; i++) {
    			list.add(br.readLine());
    		}
    		
    		//그룹 정보 넣어주기
    		map.put(group, list);
    	}
    	
    	//M개의 질문
    	while(M-->0) {
    		//문제에 사용될 이름 및 형식(0 or 1) 입력
    		String name = br.readLine();
    		int index = Integer.parseInt(br.readLine());
    		
    		//0이 입력된 경우
    		if(index == 0) {
    			//해당 그룹의 멤버들 이름을 리스트에 넣어주기
    			List<String> members = map.get(name);
    			
    			//오름차순 정렬
    			Collections.sort(members);
    			
    			//스트링빌더에 저장
    			for(String str : members) {
    				sb.append(str + "\n");
    			}
    		}else { //1이 입력된 경우
    			//맵의 모든 key(그룹이름)에 대하여
    			for(String key : map.keySet()) {
    				//해당 멤버의 이름을 가지고 있으면
    				if(map.get(key).contains(name)) {
    					//그 그룹의 이름 스트링빌더에 저장
    					sb.append(key + "\n");
    				}
    			}
    		}
    	}
    	
    	System.out.println(sb.toString());
    }
}	
