import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        //A, B 배열 선언
        int[] A = new int[10];
        int[] B = new int[10];
        
        st = new StringTokenizer(br.readLine());
        for(int i=0 ; i<10 ; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for(int i=0 ; i<10 ; i++) {
            B[i] = Integer.parseInt(st.nextToken());
        }

        int ACount = 0; 
        int BCount = 0; 
        int DCount = 0;

        for(int i=0 ; i<10 ; i++) {
            if(A[i] > B[i]) {
                ACount++;
            }else if(A[i] < B[i]) {
                BCount++;
            }else {
                DCount++;
            }
        }

        if(ACount == BCount) {
            System.out.println("D");
        }else if(ACount > BCount) {
            System.out.println("A");
        }else {
            System.out.println("B");
        }
    }
}