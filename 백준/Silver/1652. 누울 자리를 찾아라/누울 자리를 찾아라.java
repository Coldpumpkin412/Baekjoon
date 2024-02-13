import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        //방의 크기 N 입력
		int N = Integer.parseInt(br.readLine());
		
        //맵 선언
		char[][] map = new char[101][101];
        
        //가로, 세로 누울 수 있는 자리 개수 
		int horizontal = 0;
		int vertical = 0;
		
        //맵 입력
		for(int i=0 ; i<N ; i++) {
			String str = br.readLine();
            
			for(int j=0 ; j<N ; j++) {
				map[i][j] = str.charAt(j);
			}
		}
		
		for(int i=0 ; i<N ; i++){
            //눕기 가능여부 확인 변수
			int check_h = 0;
            int check_v = 0;
            
			for(int j=0 ; j<N ; j++){
                //가로방향 확인
				if(map[i][j] == '.'){
                    check_h++;
                } 
				if(map[i][j]=='X' || (j==N-1)){
					if(check_h >= 2){
                        horizontal++;  
                    } 
                    //가로방향 초기화
					check_h = 0;
				}
				
				//세로방향 확인
				if(map[j][i] == '.'){
                    check_v++;  
                } 
				if(map[j][i]=='X' || (j==N-1)){
					if(check_v >= 2){
                        vertical++;
                    } 
                    //세로방향 초기화
					check_v = 0;
				}
			}
		}
		
        //결과 출력
		System.out.println(horizontal + " " + vertical);
	}
}