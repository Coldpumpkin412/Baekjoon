import java.util.*;
import java.io.*;

class Main{
    
    //세 좌표를 알 때 넓이 구하는 메소드(공식)
    public static double area(int[] a, int[] b, int[] c) {
        return (double) Math.abs(a[0]*b[1] + b[0]*c[1] + c[0]*a[1] - a[1]*b[0] - b[1]*c[0] - c[1]*a[0]) / 2;
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));        
        StringTokenizer st;
        
        //N 입력 및 좌표 저장 배열 선언
        int N = Integer.parseInt(br.readLine());        
        int[][] points = new int[N][2];
        
        //좌표 입력
        for(int i=0 ; i<N ; i++) {
            st = new StringTokenizer(br.readLine());
            
            points[i][0] = Integer.parseInt(st.nextToken());
            points[i][1] = Integer.parseInt(st.nextToken());
        }
        
        //최댓값 변수 선언 및 초기값
        double max = 0;
        
        //세 좌표로 이루어진 삼각형의 넓이 최댓값 갱신
        for (int i=0 ; i<N-2 ; i++) {
            for (int j=i+1 ; j<N-1 ; j++) {
                for (int k=j+1 ; k<N ; k++) {
                    max = Math.max(max, area(points[i], points[j], points[k]));
                }
            }
        }

        System.out.println(max);
    }
}