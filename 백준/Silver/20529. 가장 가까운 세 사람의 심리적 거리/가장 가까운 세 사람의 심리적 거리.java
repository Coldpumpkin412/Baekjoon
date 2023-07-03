import java.util.*;
import java.io.*;

public class Main {
	//심리적 거리 구하는 함수 distance
    private static int calcDistance(String str1, String str2, String str3) {
        int distance = 0;
        
        for (int i=0 ; i<4 ; i++) {
            distance += (str1.charAt(i) != str2.charAt(i) ? 1 : 0);
            distance += (str2.charAt(i) != str3.charAt(i) ? 1 : 0);
            distance += (str3.charAt(i) != str1.charAt(i) ? 1 : 0);
        }
        return distance;
    }
    
	public static void main(String[] args) throws IOException{
		/*
		 * MBTI는 각각 2개의 종류를 가진 카테고리가 4개가 있음.(총 경우의 수 16개) 
		 * 비둘기집의 원리를 활용한다면 적어도 33명이 있어야 임의의 3명에 대한 심리적거리가 0이 될 수 있다.
		 */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        //테스트케이스 개수
        int T = Integer.parseInt(br.readLine());
        
        while(T-->0){
            // input
            final int N = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            
            //비둘기집 원리를 이용 33명부터 심리적거리 0 을 보장
            int personnel = (N>32) ? 33 : N;
            
            String[] person = new String[personnel];
            
            for (int i=0 ; i<personnel ; i++) person[i] = st.nextToken();
           
            int minDistance = 12;
            
            Loop:
            for (int i=0 ; i<personnel ; i++) {
                for (int j=i+1 ; j<personnel ; j++) {
                    for (int k=j+1 ; k<personnel ; k++) {
                    	
                        minDistance = Math.min(minDistance, calcDistance(person[i], person[j], person[k]));
                        
                        if (minDistance == 0) {
                        	//루프 빠져나오기
                            break Loop;
                        }
                    }
                }
            }
            
            System.out.println(minDistance);
        }
    }
	
}	
