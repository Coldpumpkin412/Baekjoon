import java.util.*;
import java.io.*;

public class Main {
	
    public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st;
    	StringBuilder sb = new StringBuilder();
    	
    	//집합 A의 원소의 개수, B의 원소의 개수 선언
    	st = new StringTokenizer(br.readLine());
    	int A = Integer.parseInt(st.nextToken());
    	int B = Integer.parseInt(st.nextToken());    	
    	
    	//집합 A를 트리셋으로 선언(원소가 중복 될 수 있으므로 중복을 무시하고 자동으로 오름차순 정렬이 되는 트리셋 활용)
    	Set<Integer> setA = new TreeSet<>();
    	
    	//A의 원소 입력
    	st = new StringTokenizer(br.readLine());
    	for(int i=0 ; i<A ; i++) {
    		setA.add(Integer.parseInt(st.nextToken()));
    	}
    	
    	//B의 원소를 확인하며 A에 있는 경우 count 증가
    	st = new StringTokenizer(br.readLine());
    	for(int i=0 ; i<B ; i++) {
    		int num = Integer.parseInt(st.nextToken());
    		
    		//B의 원소가 A에도 있다면 제거
    		if(setA.contains(num)) {
    			setA.remove(num);
    		}
    	}
    	
    	//차집합의 개수 및 원소 출력
    	sb.append(setA.size()).append("\n");
    	
    	for(int num : setA) {
    		sb.append(num+" ");
    	}
    	
    	System.out.println(sb);
    }
}	
