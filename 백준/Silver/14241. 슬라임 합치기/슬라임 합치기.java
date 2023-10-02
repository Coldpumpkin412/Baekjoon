import java.util.*;
import java.io.*;

public class Main {
	
    public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st;
    	
    	//슬라임 정보 저장 리스트
    	List<Integer> slime = new ArrayList<>();
    	
    	int score = 0;
    	
    	//슬라임 개수 입력
    	int N = Integer.parseInt(br.readLine());
    	
    	//슬라임 정보 입력
    	st = new StringTokenizer(br.readLine());
    	while(N-->0) {
    		slime.add(Integer.parseInt(st.nextToken()));
    	}
    	
    	//슬라임이 하나만 남을때까지
    	while(slime.size() != 1) {
    		//슬라임 리스트를 오름차순 정렬
    		Collections.sort(slime);
    		
    		//최댓값과 그것보다 작은값을 점수 누적합에 저장
    		score += slime.get(slime.size()-1) * slime.get(slime.size()-2);
    		
            //합체된 슬라임값
    		int sum = slime.get(slime.size()-1) + slime.get(slime.size()-2);
    		
    		//해당 값들은 리스트에서 삭제
    		slime.remove(slime.size()-1);
    		slime.remove(slime.size()-1);
    		
    		//합체된 슬라임 값을 다시 저장
    		slime.add(sum);
    	}
    	
    	System.out.println(score);
    }
}	
