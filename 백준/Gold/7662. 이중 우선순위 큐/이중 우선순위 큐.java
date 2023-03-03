import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		/*
		 * TreeMap을 활용하여 풀기
		 * TreeMap은 <키,값> 삽입과 동시에 키 값의 오름차순으로 정렬된다.
		 * firstkey()와 lastkey() 메소드를 통해 가장 작은값, 가장 큰 값의 출력이 가능하다
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		//테스트케이스 T입력
		int T = Integer.parseInt(br.readLine());
		
		for(int i=0 ; i<T ; i++) {
			TreeMap<Integer, Integer> treeMap = new TreeMap<>();
			
			//연산횟수 입력
			int count = Integer.parseInt(br.readLine());
			
			for(int j=0 ; j<count ; j++) {
				st = new StringTokenizer(br.readLine());
				
				String str = st.nextToken();
				int number = Integer.parseInt(st.nextToken());
				
				//I가 입력된 경우 트리맵에 삽입(key : 위에 입력된 number, value : 1)
				if(str.equals("I")) {
					//중복원소도 가능하기때문에 value로 빈도를 표시해준다
					treeMap.put(number, treeMap.getOrDefault(number, 0)+1);
				}else {//D가 입력된 경우
					
					//트리맵이 비어있는 경우 무시
					if(treeMap.isEmpty()) continue;
					
					//number가 1인경우 최대값 삭제(기본 오름차순 정렬이기 때문에 lastKey()활용)
					if(number == 1) {
						int value = treeMap.get(treeMap.lastKey());
						
						if(value == 1) {//빈도가 1인경우 아예 트리맵에서 삭제
							treeMap.remove(treeMap.lastKey());
						}else { //빈도가 2 이상인 경우 하나 감소
							treeMap.put(treeMap.lastKey(), value-1);
						}
					}else if(number == -1) {//number가 -1인경우 최소값 삭제(기본 오름차순 정렬이기 때문에 firstKey()활용)
						int value = treeMap.get(treeMap.firstKey());
						
						if(value == 1) {//빈도가 1인경우 아예 트리맵에서 삭제
							treeMap.remove(treeMap.firstKey());
						}else { //빈도가 2 이상인 경우 하나 감소
							treeMap.put(treeMap.firstKey(), value-1);
						}
					}
				}
			}
			
			//모든 연산이 끝난 후 트리맵이 비어있다면 "EMPTY"를 출력
			if(treeMap.isEmpty()) {
				System.out.println("EMPTY");
			}else {//아닌 경우 최댓값과 최솟값 출력
				System.out.println(treeMap.lastKey() + " " + treeMap.firstKey());
			}
		}
		
	}
}

	
