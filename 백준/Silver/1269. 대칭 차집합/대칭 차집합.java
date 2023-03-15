import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		/*
		 * 대칭차집합의 원소의 개수 = (A-B) U (B-A)  *여기서 '-'는 차집합을 뜻한다.
		 * 즉, (AUB) - (A∩B)와 같다.
		 * 이것의 원소의 개수는 (A의 원소개수) + (B의 원소개수) - 2*(A∩B의 원소개수) 와 같다
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		Map<Integer, Integer> map = new HashMap<>();
		
		//A,B의 원소 개수 입력 및 원소개수의 합 선언
		st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int all = A+B;
		
		
		//A의 원소입력 후 해시맵에 저장(key : 입력값, value : 나온횟수)
		st = new StringTokenizer(br.readLine());
		for(int i=0 ; i<A ; i++) {
			int number = Integer.parseInt(st.nextToken());
			
			//key가 존재한다면 해당 key의 value를 +1, 처음 입력되는 key값이라면 0을 할당 후 +1 해준다
			map.put(number, map.getOrDefault(number, 0)+1);
		}
		
		//교집합 원소개수 변수
		int inter = 0;
		
		//B의 원소 입력 후 해시맵 값 업데이트
		st = new StringTokenizer(br.readLine());
		for(int i=0 ; i<B ; i++) {
			int number = Integer.parseInt(st.nextToken());
			
			//key가 존재한다면 해당 key의 value를 +1, 처음 입력되는 key값이라면 0을 할당 후 +1 해준다
			map.put(number, map.getOrDefault(number, 0)+1);
			
			//value가 2라면 A와B모두 등장한 것이므로 교집합인 원소이다
			if(map.get(number) == 2) {
				inter++;
			}
		}
		
        //(A의 원소개수) + (B의 원소개수) - 2*(A∩B의 원소개수) 출력
		System.out.println(all - 2*inter);
	}
}

	
