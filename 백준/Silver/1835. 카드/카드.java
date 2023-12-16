import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
        
        //활용할 데크 선언
		Deque<Integer> deque = new ArrayDeque<>();
		
		//카드 개수 N 입력
		int N = sc.nextInt();		
		
        //데크에 넣어주기
		deque.addFirst(N);
		
		if(N == 1){
			System.out.println("1");
			return;
		}else{
			deque.addFirst(N-1);
			while(true) {
				N--;
                
				for(int i=N ; i>0 ; i--) {
					int last = deque.peekLast();
                    
					deque.addFirst(last);
					deque.pollLast();
				}
				if(N == 1){
                  break;  
                } 
                
				deque.addFirst(N-1);
			}
			
		}
        
		Iterator iter = deque.iterator(); 
		while(iter.hasNext()) {
			System.out.print(iter.next() + " ");
		}
		return;
	}
}