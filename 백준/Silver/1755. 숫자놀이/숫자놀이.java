import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
    	//해시맵 활용
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st;
    	
    	//해시맵 선언(key : 영어로변환된 숫자, value : 숫자
    	Map<String,Integer> map = new HashMap<>();
    	
    	//M, N 입력
    	st = new StringTokenizer(br.readLine());
    	int M = Integer.parseInt(st.nextToken());
    	int N = Integer.parseInt(st.nextToken());
    			
    	//M이상, N이하 정수들 맵에 입력
    	for(int i=M ; i<=N ; i++) {
    		//숫자를 문자열로 변환후 영단어로 치환
    		String num = Integer.toString(i);
    		num = num.replace("0", "zero").replace("1", "one").replace("2", "two").replace("3", "three").replace("4", "four")
    				 .replace("5", "five").replace("6", "six").replace("7", "seven").replace("8", "eight").replace("9", "nine");
    		
    		//해시맵에 넣기
    		map.put(num, i);
    	}
    	//해시맵에 키값들 리스트에 넣어주기
    	List<String> list = new ArrayList<>(map.keySet());
    	
    	//오름차순 정렬
    	Collections.sort(list);
    	
    	//출력(한줄에 10개씩)
    	int count = 0;
    	for(String key : list) {
    		if(count==10) {
    			System.out.println();
    			count = 0;
    		}
    		System.out.print(map.get(key)+" ");
    		count++;
    	}
    }
}	
