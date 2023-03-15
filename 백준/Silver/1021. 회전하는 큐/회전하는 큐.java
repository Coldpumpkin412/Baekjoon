import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException{
        /*
         * deque(데크) 활용하여 푸는것도 가능하지만
         * LinkedList를 활용하여 유사하게 푸는것도 가능하다
         */
		Scanner sc = new Scanner(System.in);
		
		LinkedList<Integer> list = new LinkedList<>();
        //2번, 3번 연산 실행횟수 저장 변수
		int count = 0;
		
		//LinkedList의 크기 N과 뽑으려는 수의 개수 M 입력
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		//LinkedList의 크기를 기반으로 큐 값 입력 및 뽑아내고자하는 값 입력
		for(int i=1 ; i<=N ; i++) {
			list.offer(i);
		}
		int[] arr = new int[M];
		for(int i=0 ; i<M ; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i=0 ; i<M ; i++) {
			//뽑아내고자하는 수의 위치 확인하는 변수
			int index = list.indexOf(arr[i]);
            
			//현재 중간지점을 알아내는 변수(길이가 짝수라면 하나 적게, 홀수라면 딱 중간지점 설정)
			int half;
			if(list.size()%2 == 0) half = list.size()/2 - 1 ;
			else half = list.size()/2;
			
			//중간 지점 또는 중간 지점보다 앞에 있을 경우
			if(index <= half) {
				//2번연산 실행
				for(int j=0; j<index ; j++) {
					int temp = list.pollFirst();
					list.offerLast(temp);
					count++;
				}
			}
			else {	//중간 지점보다 원소의 위치가 뒤에 있는 경우 
				//3번연산 실행
				for(int j=0; j<list.size() - index; j++) {
					int temp = list.pollLast();
					list.offerFirst(temp);
					count++;
				}
			}
            
            //연산 실행 후 맨 앞에 있는 값 삭제
			list.pollFirst();	
		}
		
		System.out.println(count);
	}
}

	
