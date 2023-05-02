import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        //N,M입력 및 정답 초기화
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int answer = 0;

        char[][] matrixA = new char[N][M];
        char[][] matrixB = new char[N][M];

        for(int i=0 ; i<N ; i++){
            //행렬 A입력 및 배열에 선언
            String str = br.readLine();
            matrixA[i] = str.toCharArray();
        }

        for(int i=0 ; i<N ; i++){
            //행렬 B입력 및 배열에 선언
            String str = br.readLine();
            matrixB[i] = str.toCharArray();
        }

        for(int i=0 ; i<N-2 ; i++){
            for(int j=0 ; j<M-2 ; j++){
                if(matrixA[i][j] == matrixB[i][j]) continue;

                answer++;
                
                for(int x=i ; x<i+3 ; x++){
                    for(int y=j ; y<j+3 ; y++){
                        //삼항연산자 활용
                        matrixA[x][y] = matrixA[x][y] == '1' ? '0' : '1'; 
                    }
                }
            }
        }

        for(int i=0 ; i<N ; i++){
            for(int j=0 ; j<M ; j++){
                if(matrixA[i][j] != matrixB[i][j]){
                    //같지않다면 -1 출력 후 종료
                    System.out.println(-1);
                    return;
                }
            }
        }

        System.out.println(answer);

    }
}