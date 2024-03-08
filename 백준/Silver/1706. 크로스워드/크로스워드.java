import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st;
    	
    	//퍼즐의 행 R, 열 C 입력
    	st = new StringTokenizer(br.readLine());
    	int R = Integer.parseInt(st.nextToken());
    	int C = Integer.parseInt(st.nextToken());
    	
    	//퍼즐 선언
    	char[][] puzzle = new char[R][C];
    	
    	//퍼즐값 입력
    	for(int i=0 ; i<R ; i++) {
    		String line = br.readLine();
    		
    		puzzle[i] = line.toCharArray();
    	}
    	
    	//초기 비교값 (소문자 z보다 큰 값으로)
    	String min = String.valueOf((char)('z'+ 1));    	
    	
    	//가로영역 확인
    	for(int i=0 ; i<R ; i++) {
    		String str = "";
    		
    		for(int j=0 ; j<=C ; j++) {
    			
    			//글자가 #이거나 마지막 글자인 경우
        		if(j==C || puzzle[i][j]=='#') {
        			
        			//여태 저장된 문자 길이가 2 이상인 경우 최솟값 비교하여 갱신
        			if(str.length()>=2 && min.compareTo(str)>0) {
        				min = str;
        			}else { //아닌경우 초기화
        				str = "";
        			}
        		}else {
        			str += puzzle[i][j];
        		}
    		}
    	}
    	
    	//세로영역 확인
    	for(int i=0 ; i<C ; i++) {
    		String str = "";
    		
    		for(int j=0 ; j<=R ; j++) {
    			
    			//글자가 #이거나 마지막 글자인 경우
    			if(j==R || puzzle[j][i]=='#') {
    				
    				//여태 저장된 문자 길이가 2이상인 경우 최솟값 비교하여 갱신
    				if(str.length()>=2 && min.compareTo(str)>0) {
    					min = str;
    				}else { //아닌경우 초기화
    					str = "";
    				}
    			}else {
    				str += puzzle[j][i];
    			}
    		}
    	}
    	
    	System.out.println(min);
    }
}	
