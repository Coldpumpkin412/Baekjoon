import java.util.*;
import java.io.*;

public class Main {	
    
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
        
        String[] S = br.readLine().split(" ");
        
        //분할된 단어들을 리스트에 넣기
        List<String> list = new ArrayList<>();
        
        for(int i=0 ; i<S.length ; i++) {
        	if(list.contains(S[i])) {
        		System.out.println("no");
        		return;
        	}
        	
        	list.add(S[i]);
        }
        
        System.out.println("yes");
    }
}
