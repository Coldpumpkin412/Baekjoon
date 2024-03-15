import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st;
    	
    	//개각총회 시작시간 S, 끝낸시간 E, 스트리밍 끝낸시간 Q 입력
    	st = new StringTokenizer(br.readLine());
    	String S = st.nextToken();
    	String E = st.nextToken();
    	String Q = st.nextToken();
    	
    	//시작시간 이전, 끝낸시간 이후, 닉네임 저장할 Hashet 선언(중복허용x)
    	Set<String> before = new HashSet<>();
    	Set<String> after = new HashSet<>();
    	Set<String> nameSet = new HashSet<>();
    	
    	String str;
    	
    	//입력값이 있다면
    	while((str = br.readLine()) != null) {
    		//입력값을 공백 기준으로 분류
    		String[] arr = str.split(" ");
    		
    		//앞에는 시간, 뒤에는 닉네임
    		String time = arr[0];
    		String name = arr[1];
    		
    		//닉네임 저장셋에 저장
    		nameSet.add(name);
    		
    		//시작시간과 비교하여 이전이라면 before에 추가
    		if(S.compareTo(time) >= 0) {
    			before.add(name);
    		}else if(E.compareTo(time)<=0 && Q.compareTo(time)>=0) {
    			//끝낸시간과 스트리밍 종료시간 사이에 있다면 after에 추가
    			after.add(name);
    		}
    	}
    	
    	int answer = 0;
    	
    	//네임셋에 들어있는 닉네임을 기준으로
    	for(String name : nameSet) {
    		//before, after 둘 다 들어있는 닉네임이라면 카운팅
    		if(before.contains(name) && after.contains(name)) {
    			answer++;
    		}
    	}
    	
    	System.out.println(answer);
    }
}	
