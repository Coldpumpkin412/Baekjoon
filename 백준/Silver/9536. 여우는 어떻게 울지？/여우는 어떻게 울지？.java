import java.util.*;
import java.io.*;


public class Main {
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st;
    	
    	
    	//테스트케이스 개수 T 입력
    	int T = Integer.parseInt(br.readLine());
    	
    	while(T-->0) {
    		StringBuilder sb = new StringBuilder();
    		
    		//녹음된 소리 입력 후 공백 기준으로 나누어 리스트에 넣어주기
    		String[] sound = br.readLine().split(" ");
    		
    		List<String> list = new ArrayList<>();
    		
    		for(int i=0 ; i<sound.length ; i++) {
    			list.add(sound[i]);
    		}
    		
    		while(true) {
    			//동물 울음소리 및 질문 입력
        		String question = br.readLine();
        		
        		if(question.equals("what does the fox say?")) {
        			//리스트에 들어있는 값들 순서대로 출력
        			for(String str : list) {
        				sb.append(str + " ");        			
        			}
        			
        			break;
        		}else { //울음소리가 입력된 경우
        			//goes 기준으로 나누기
        			String[] other = question.split(" goes ");
        			
        			//해당 동물 사운드 제거
        			for(int j=0 ; j<list.size() ; j++) {
                        if(list.get(j).equals(other[1])) {
                            list.remove(j); 
                            j--;
                        }
                    }
        		}
    			
    		}
    		
    		//출력
    		System.out.println(sb.toString());
    	}
    }
}	
