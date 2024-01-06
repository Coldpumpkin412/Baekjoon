import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st;
    	
    	//학생의 수 N 입력
    	int N = Integer.parseInt(br.readLine());
    	
    	//학생 점수 배열 선언 및 값 입력
    	double[] score = new double[N];
    	
    	for(int i=0 ; i<N ; i++) {
    		score[i] = Double.parseDouble(br.readLine());
    	}
    	
    	//오름차순 정렬
    	Arrays.sort(score);
    	
    	for(int i=0 ; i<7 ; i++) {
    		System.out.printf("%.3f", score[i]);
    		System.out.println();
    	}
    }
}	
