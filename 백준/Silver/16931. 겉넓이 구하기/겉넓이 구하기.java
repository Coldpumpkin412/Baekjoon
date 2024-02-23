import java.util.*;

public class Main {
    
    //방향 변수
    static int dx[] = {0, 0, 1, -1};
	static int dy[] = {1, -1, 0, 0};	    
    
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);

		//종이 크기 N, M 입력
        int N = sc.nextInt();		
        int M = sc.nextInt();		
        
        //정육면체 수 배열 선언
        int[][] arr = new int[N][M];
        
        int answer = 0;				
        
        //정육면체 수 입력
        for(int i=0 ; i<N ; i++){
			for (int j=0 ; j<M ; j++){
				arr[i][j] = sc.nextInt();
			}
		}
 
        for(int i=0 ; i<N ; i++){
			for(int j=0 ; j<M ; j++){
				for(int k=0 ; k<4 ; k++){	
					int nx = i+dx[k];
					int ny = j+dy[k];
					
					if(nx>=0 && nx<N && ny>=0 && ny<M){	
						if(arr[nx][ny] < arr[i][j]){                            
							answer += (arr[i][j]-arr[nx][ny]);
						}
					}else{
                        answer += arr[i][j];				    
                    } 
				}
			}
		}
        
        //윗면, 아랫면 더하기
        answer += 2*N*M;			
                
        System.out.println(answer);     
	}
}