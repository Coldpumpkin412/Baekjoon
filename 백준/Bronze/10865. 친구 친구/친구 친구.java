import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        
        //반 학생 수 N, M 입력
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        int[] student = new int[N+1];
        
        while(M-->0) {
            //친구관계 A, B 입력
            st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
                
            student[A]++;
            student[B]++;
        }
        
        for(int i=1 ; i<=N ; i++) {
            sb.append(student[i]).append('\n');
        }
        
        System.out.print(sb.toString());
    }
}