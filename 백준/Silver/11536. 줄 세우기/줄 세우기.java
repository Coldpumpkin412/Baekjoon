import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	//이름의 개수 N 입력
    	int N = Integer.parseInt(br.readLine());
    	
    	//이름배열 선언 및 비교배열 값 입력
    	String[] name = new String[N];
    	String[] comp = new String[N];
    	for(int i=0 ; i<N ; i++) {
    		name[i] = br.readLine();
    		comp[i] = name[i];
    	}
    	
    	//증가배열, 감소배열 선언 및 값 입력
    	String[] increase = new String[N];
    	String[] decrease = new String[N];
    	
    	//오름차순 정렬
    	Arrays.sort(comp);
    	for(int i=0 ; i<N ; i++) {
    		increase[i] = comp[i];
    		decrease[i] = comp[N-i-1];
    	}
    	
    	//오름차순배열과 같은경우
    	if(Arrays.equals(name, increase)) {
    		System.out.println("INCREASING");
    	}else if(Arrays.equals(name, decrease)) {//내림차순배열과 같은경우
    		System.out.println("DECREASING");
    	}else {
    		System.out.println("NEITHER");
    	}
    }
}	
