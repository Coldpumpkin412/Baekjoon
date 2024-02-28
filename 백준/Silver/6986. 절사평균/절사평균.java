import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        
        //점수 개수 N, 제외되는 점수 개수 K 입력
        int N = sc.nextInt();
        int K = sc.nextInt();
        
        //배열 선언 및 값 입력
        double[] score = new double[N];
        for(int i=0 ; i<N ; i++) {
            score[i] = sc.nextDouble();
        }
        
        //점수 오름차순 정렬
        Arrays.sort(score);
        
        //누적합
        double sum = 0.0;
        for(int i=K ; i<N-K ; i++) {
            sum += score[i];
        }
        
        System.out.println(String.format("%.2f", sum/(N - 2*K)+1e-8));
        
        for(int i=0 ; i<K ; i++){
            sum += score[K];
            sum += score[N-K-1];
        }
        
        //평균
        System.out.println(String.format("%.2f", sum/N + 1e-8));
    }
}