import java.util.*;
import java.io.*;

public class Main {

    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        //한 변의 길이 N 입력
        int N=Integer.parseInt(br.readLine());
        
        //처음위치 x, y 입력
        st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        
        int answer = 0;

        if(N == 1) {
            answer = 0;   
        }else if(x==1 && y==1 || x==1 && y==N || x==N && y==1 || x==N && y==N) {
            answer = 2;
        }else if(x==1 || x==N || y==1 || y==N) {
            answer = 3;
        }else {
            answer = 4;
        }

        System.out.print(answer);

    }
}