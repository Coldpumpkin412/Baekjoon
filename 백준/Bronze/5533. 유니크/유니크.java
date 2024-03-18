import java.util.*;
import java.io.*;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //참가자 수 N 입력
        int N = sc.nextInt();
        int a[][] = new int[N][3];
        int score[] = new int[N];
        
        //점수 입력
        for(int i=0 ; i<N ; i++) {
            for(int j=0 ; j<3 ; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        
        int sum = 0;
        for(int i=0 ; i<3 ; i++) {
            for(int j=0 ; j<N ; j++) {
                for(int k=0 ; k<N ; k++) {
                    if(j == k) {
                        continue;    
                    } 
                    if(a[j][i] != a[k][i]) {
                        sum = a[j][i];
                    }else {
                        sum = 0; 
                        break;
                    }
                }
                score[j] += sum;
                sum = 0;
            }
        }
        
        for(int i=0 ; i<N ; i++) {
            System.out.println(score[i]);    
        }
    }
}