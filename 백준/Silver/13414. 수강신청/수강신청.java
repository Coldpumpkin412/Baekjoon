import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st;
    	StringBuilder sb = new StringBuilder();
    	
    	//맵 및 셋은 순서대로 저장되지 않기떄문에 리스트와 해시셋이 결합된 LinkedHashSet사용
    	Set<String> set = new LinkedHashSet<>();
    	
    	//수강 가능 인원 K, 대기목록 길이 L 입력
    	st = new StringTokenizer(br.readLine());
    	int K = Integer.parseInt(st.nextToken());
    	int L = Integer.parseInt(st.nextToken());
    	
    	//수강신청 등록현황
    	while(L-->0) {
    		String str = br.readLine();
    		    		
    		//이미 목록에 있다면 지워주기
    		if(set.contains(str)) {
    			set.remove(str);
    		}
    		
    		//맨 뒤 순서로 넣어주기
    		set.add(str);
    	}
    	
    	int count = 0;
    	for(String num : set) {
    		sb.append(num).append("\n");
    		
    		count++;
    		
    		//수강가능 인원에 도달하면 루프 나오기
    		if(count == K) {
    			break;
    		}
    	}
    	
    	System.out.println(sb.toString());
    }
}	
