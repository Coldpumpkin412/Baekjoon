import java.util.*;
import java.io.*;

public class Main {
    //별들을 저장할 배열 선언
	static char[][] arr;
    
    //star 함수
    static void star(int x, int y, int N, boolean blank) {
		//공백칸일 경우
		if(blank){
			for(int i=x ; i<x+N ; i++){
				for(int j=y ; j<y+N ; j++){
                    //공백을 넣어주기
					arr[i][j] = ' ';
				}
			}
			return;
		}
 
		//더이상 분할이 되지 않을 때 별 넣어주기
		if(N == 1){
			arr[x][y] = '*';
			return;
		}
 
		/*
		   N=27 일 경우 한 블록의 사이즈는 9이고, 
		   N=9 일 경우 한 블록의 사이즈는 3이듯
		   해당 블록의 한 칸을 담을 변수를 의미 size
           
		   count는 별 출력 누적을 의미
		 */
         
        //블록 한 칸을 담을 변수 
		int size = N/3;
        
        //별의 누적 출력 수
		int count = 0;
        
		for(int i=x ; i<x+N ; i+=size){
			for(int j=y ;j<y+N ; j+=size){
				count++;
                
                //공백 칸
				if(count==5){
					star(i, j, size, true);
				}else {
					star(i, j, size, false);
				}
			}
		}
	} 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        //N 입력 및 배열 크기 지정
		int N = Integer.parseInt(br.readLine());
		arr = new char[N][N];
        
        //star 함수 실행
		star(0, 0, N, false);
 
		
		for(int i=0 ; i<N ; i++){
			for (int j=0 ; j<N ; j++) {
				sb.append(arr[i][j]);
			}
			sb.append('\n');
		}
		System.out.print(sb);
	}
}