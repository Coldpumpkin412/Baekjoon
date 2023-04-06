import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Map<String,Integer> map = new HashMap<>();
		int answer = 0;
		//채팅방 기록 수 입력
		int N = Integer.parseInt(br.readLine());
		
		while(N-->0) {
			String command = br.readLine();
			
			//Enter가 입력된 경우
			if(command.equals("ENTER")) {
				//맵의 크기를 더해준 후 맵 초기화
				answer += map.size();
				map.clear();
			}else {//아이디가 입력된경우
				map.put(command,0);
			}
		}
		
		System.out.println(answer+map.size());
	}
}

	
