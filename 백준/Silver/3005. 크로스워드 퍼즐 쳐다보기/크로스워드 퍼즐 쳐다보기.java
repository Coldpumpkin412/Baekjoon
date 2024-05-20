import java.util.*;
import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st;
    	
    	//행의 개수 R, 열의 개수 C 입력
    	st = new StringTokenizer(br.readLine());
    	int R = Integer.parseInt(st.nextToken());
    	int C = Integer.parseInt(st.nextToken());
    	
    	//크로스워드 퍼즐 선언
    	char[][] puzzle = new char[R][C];
    	
    	//퍼즐 입력
    	for(int i=0 ; i<R ; i++) {
    		puzzle[i] = br.readLine().toCharArray();    		
    	}
    	
    	//단어들을 저장할 리스트 선언
    	List<String> list = new ArrayList<>();
    	
    	//모든 행에 대하여    
    	for(int i=0 ; i<R ; i++) {
    		String word = "";
    		
    		for(int j=0 ; j<C ; j++) {
    			word += puzzle[i][j];
    		}
    		
    		//#을 기준으로 분리
    		String[] word_split = word.split("#");
    		
    		for(int j=0 ; j<word_split.length ; j++) {
    			//2글자 이상인 경우 리스트에 넣기(중복 허용X)
    			if(word_split[j].length()>=2 && !list.contains(word_split[j])) {
    				list.add(word_split[j]);
    			}
    		}
    	}
    	
    	//모든 열에 대하여    
    	for(int i=0 ; i<C ; i++) {
    		String word = "";
    		
    		for(int j=0 ; j<R ; j++) {
    			word += puzzle[j][i];
    		}
    		
    		//#을 기준으로 분리
    		String[] word_split = word.split("#");
    		
    		for(int j=0 ; j<word_split.length ; j++) {
    			//2글자 이상인 경우 리스트에 넣기(중복 허용X)
    			if(word_split[j].length()>=2 && !list.contains(word_split[j])) {
    				list.add(word_split[j]);
    			}
    		}
    	}
    	
    	//오름차순 정렬
    	Collections.sort(list);
    	
    	//첫번째 단어 출력
    	System.out.println(list.get(0));
    }
}	
