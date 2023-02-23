import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//나무의 수(최대 100만)와 집으로 가져가려는 나무의 길이(최대 20억) 입력
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		//나무의 길이들 저장할 배열
		int[] tree = new int[N]; 
		for(int i=0 ; i<N ; i++) tree[i] = sc.nextInt();
		
		//이진탐색에 활용할 변수들
		int min = 0;
		int max = (int)2e9; //최대 20억
		int answer = 0;
		
		while(min <= max) {
			long sum = 0; //잘린 나무길이들의 합
			int mid = (min+max) / 2;
			
			//나무를 자른 후의 길이의 합 구하기
			for(int i=0 ; i<N ; i++) if(tree[i] > mid) sum += (tree[i]-mid);
			
			//요청한 길이보다 작다면 절단기를 왼쪽으로 옮기기
			if(sum < M) {
				max = mid-1;
			}else { //아니라면 중간값을 정답으로 저장 후 절단기를 오른쪽으로 옮기기
				answer = mid;
				min = mid+1;
			}
		}
		
		System.out.println(answer);
	}
}

	
