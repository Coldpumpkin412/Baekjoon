import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st;
    	
    	//A, P 입력
    	st = new StringTokenizer(br.readLine());
    	int A = Integer.parseInt(st.nextToken());
    	int P = Integer.parseInt(st.nextToken());
    	
    	//리스트 선언 및 초기값 입력
    	List<String> D = new ArrayList<>();
    	D.add(Integer.toString(A));
    	
    	for(int i=1 ; ; i++) {
    		//앞의 숫자를 한글자씩 쪼개어 배열에 넣기
    		String[] arr = D.get(i-1).split("");
    		
    		int num = 0;
    		for(int j=0 ; j<arr.length ; j++) {
    			//각 글자의 P제곱만큼 더해주기
    			num += Math.pow(Integer.parseInt(arr[j]), P);    			    	
    		}
    		
    		//해당값이 리스트에 이미 있다면 해당 인덱스 출력 및 종료
    		if(D.contains(Integer.toString(num))) {
    			System.out.println(D.indexOf(Integer.toString(num)));
    			
    			return;
    		}
    		
    		//존재하지않다면 리스트 넣어주기
    		D.add(Integer.toString(num));
    	}
    	
    }
}	
