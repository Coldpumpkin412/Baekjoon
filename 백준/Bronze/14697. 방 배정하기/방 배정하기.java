import java.util.*;
import java.io.*;
 
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
 
        //A, B, C, N 입력
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int N = sc.nextInt();
 
        for(int i=0 ; i<300 ; i++) {
                for(int j=0 ; j<150 ; j++) {
                    for(int k=0 ; j<100 ; k++) {
                        int answer = (A*i)+(B*j)+(C*k);
                        
                        if(answer == N) {
                            System.out.println(1);
                            return;
                        }
                        if(answer > N) {
                            break;
                        }
                            
                    }
                }
            }
        
        System.out.println(0);
    }
}
 