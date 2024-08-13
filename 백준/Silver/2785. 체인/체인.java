import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        //체인 개수 N 입력
		int N = Integer.parseInt(br.readLine());
        
		int count=0;
        
		List<Integer> list=new ArrayList<Integer>();
				
        //체인 길이 입력하여 리스트에 넣어주기
		st = new StringTokenizer(br.readLine());
		for(int i=0 ; i<N ; i++) {
            list.add(Integer.parseInt(st.nextToken()));
        }
			
		//오름차순 정렬
		Collections.sort(list);
		
		while(true) {
			if(list.size() <= 1) {
                break;
            }
				
			list.set(0, list.get(0)-1);
			list.remove(list.size()-1); 
            
			if(list.get(0) == 0) {
                list.remove(0);
            }
				
			count++;
		}
		
		System.out.println(count);
	}
}