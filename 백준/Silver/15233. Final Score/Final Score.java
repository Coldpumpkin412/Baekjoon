import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        //해시셋 선언
        Set<String> set = new HashSet<>();

        //B, G 입력 (A 무시)
        st = new StringTokenizer(br.readLine());
        st.nextToken();
        int B = Integer.parseInt(st.nextToken());
        int G = Integer.parseInt(st.nextToken());
        
        //A꺼 무시
        br.readLine();

        st = new StringTokenizer(br.readLine());
        while(B-->0) {
            set.add(st.nextToken());
        }

        int A = -1;
        
        st = new StringTokenizer(br.readLine());
        while(G-->0) {
            if(set.contains(st.nextToken())) {
                B++;
            }else {
                A++;
            }
        }

        System.out.println(A==B ? "TIE" : A>B ? "A" : "B");
    }
}