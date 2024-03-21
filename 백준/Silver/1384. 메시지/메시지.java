import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        int num = 1;
		
		//무한루프
		while(true) {
			//참여한 아이들의 수 입력
			int N = Integer.parseInt(br.readLine());
			
			//0이 입력되면 무한루프 종료
			if(N == 0) {
                break;
            }
			
            //활동입력
			String[][] arr = new String[N][N];
			for(int i=0 ; i<N ; i++) {
				st = new StringTokenizer(br.readLine());
				for(int j=0 ; j<N ; j++) {
					arr[i][j] = st.nextToken();
				}
			}
			
			//그룹 번호 출력
			System.out.println("Group " + num);
						
			int count = 0;
			
			for(int i=0 ; i<N ; i++) {
				for(int j=0 ; j<N ; j++) {
					if(arr[i][j].equals("N")) {
						if(i < j) {
							System.out.println(arr[N - (j-i)][0] + " was nasty about " + arr[i][0]);
						}else {
							System.out.println(arr[i-j][0] + " was nasty about " + arr[i][0]);
						}
						count = 1;
					}
				}
			}
			//그룹 번호
			num++;
            
			//"N"이 없으면 아래 문구를 출력
			if(count == 0) {
				System.out.println("Nobody was nasty");
			}
			System.out.println();
		}
	}

}