import java.util.*;
import java.io.*;

public class Main {
	static int N, M;
	static int[] cow;
	
	//방문처리 배열
	static boolean[] visited;
	
	//소들의 몸무게 합을 저장할 트리셋 선언(오름차순 및 중복방지)
	static Set<Integer> set = new TreeSet<>();
	
	//DFS함수
	static void DFS(int start, int sum, int depth) {
		//M마리의 소가 선택 됐다면
		if(depth == M) {
			//소수인지 판별 후 소수라면 트리셋에 넣어주기
			if(isPrime(sum)) {
				set.add(sum);
			}
			
            //종료
			return;
		}
		
		//중복된 경우를 제거해주기 위해
		for(int i=start ; i<N ; i++) {
			//방문한 적이 없다면
			if(!visited[i]) {
				//방문처리
				visited[i] = true;
				
				//재귀호출
				DFS(i+1, sum+cow[i], depth+1);
				
				visited[i] = false;
			}
		}
	}
	
	//소수판별 isPrime함수
	static boolean isPrime(int number) {
		//1은 소수가 아니다
		if(number < 2) {
			return false;
		}else {
			//제곱근까지 비교
			for(int i=2 ; i*i<=number ; i++) {
				//1을 제외한 약수가 존재한다면 소수가 아니다
				if(number%i == 0) {
					return false;
				}
			}
		}
		
		return true;
	}
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st;
    	
    	//농장에 있는 소들의 수 N, 선별할 소의 수 M 입력
    	st = new StringTokenizer(br.readLine());
    	N = Integer.parseInt(st.nextToken());
    	M = Integer.parseInt(st.nextToken());
    	
    	//방문처리 배열 선언
    	visited = new boolean[N];
    	
    	//소들의 몸무게 배열 선언 및 값 입력
    	cow = new int[N];
    	
    	st = new StringTokenizer(br.readLine());
    	for(int i=0 ; i<N ; i++) {
    		cow[i] = Integer.parseInt(st.nextToken());
    	}
    	
    	//DFS함수 실행
    	DFS(0, 0, 0);
    	
    	//트리셋에 값이 없는경우
    	if(set.size() == 0) {
    		System.out.println(-1);
    	}else {//값이 있는 경우
            
            //출력을 위한 이터레이터 선언
    		Iterator<Integer> iter = set.iterator();
    		while(iter.hasNext()) {
    			System.out.print(iter.next() + " ");
    		}
    	}
    }
}	
