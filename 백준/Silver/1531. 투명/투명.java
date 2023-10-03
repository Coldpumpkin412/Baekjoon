import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //N, M 입력
        int N = sc.nextInt();
        int M = sc.nextInt();
        
        //그림 배열 선언
        int picture[][] = new int[101][101];
        
        for(int i=0 ; i<N ; i++) {
            //좌표 입력
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            
            for(int j=x1 ; j<=x2 ; j++) {
                for(int k=y1 ; k<=y2 ; k++) {
                    picture[j][k] += 1;
                }
            }
        }
        
        int answer = 0;
        for(int i=1 ; i<=100 ; i++) {
            for(int j=1 ; j<=100 ; j++) {
                if(picture[i][j] > M) {
                    answer++;
                }
            }
        }
        System.out.println(answer);        
    }
}