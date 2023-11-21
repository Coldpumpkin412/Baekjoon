import java.util.*;

public class Main {
    //별 그림 배열
    static char[][] star;
    
    //배열 채울 함수
    public static void pointStar(int row, int col) {
        for(int i=row ; i<col ; i++) {
            star[row][i] = '*'; // 맨위 가로
            star[col-1][i] = '*'; // 맨 아래 가로
            star[i][row] = '*'; // 왼쪽 세로
            star[i][col-1] = '*'; // 오른쪽 세로
        }

        if(col == 1) {
            return;
        }
        
        //재귀 호출
        pointStar(row+2, col-2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //N 입력 및 M 선언 후 배열 크기 입력
        int N = sc.nextInt();
        int M = 1 + 4*(N-1);
        
        star = new char[M][M];

        for(int i=0 ; i<M ; i++) {
            for(int j=0 ; j<M ; j++) {
                star[i][j] = ' ';
            }
        }

        pointStar(0, M);
        
        //출력
        for(int i=0 ; i<M ; i++) {
            for(int j=0 ; j<M ; j++) {
                System.out.print(star[i][j]);
            }
            System.out.println();
        }
    }
}