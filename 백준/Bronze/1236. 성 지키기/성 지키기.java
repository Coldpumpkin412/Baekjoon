import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
        //N, M 입력
		int N = sc.nextInt();	
		int M = sc.nextInt();
        
        //행, 열 및 배열 선언
		int row = 0;	
		int col = 0;	
		char[][] map = new char[N][M];
        
		for(int i=0 ; i<map.length ; i++) {
			String str = sc.next();
            
			for(int j=0 ; j<map[i].length ; j++) {
				map[i][j] = str.charAt(j);
			}
		}
		
		//필요한 경비원 수(행)
		for(int i=0 ; i<N ; i++) {
			boolean flag = true;
            
			for(int j=0 ; j<M ; j++) {
				if(map[i][j] == 'X') {
					flag = false;
					break;
				}
			}
			if(flag){
                row++;
            }
				
		}
		
		//필요한 경비원 수(열)
		for(int i=0 ; i<M ; i++) {
			boolean flag = true; 
            
			for(int j=0 ; j<N ; j++) {
				  if(map[j][i] == 'X') {
					  flag = false;
					  break;
				  }
			}
			if(flag){
                col++;
            }
				
		}
		
		//더 많은 경비원 출력
		System.out.println(Math.max(row, col));
	}

}