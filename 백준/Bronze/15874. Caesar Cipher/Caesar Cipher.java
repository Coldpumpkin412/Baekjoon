import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        
        //K, S 입력
        st = new StringTokenizer(br.readLine());
        int K = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());
        
        K %= 26;
        
        //입력문장 배열로 변환
        char[] word = br.readLine().toCharArray();
        
        for(int i=0 ; i<S ; i++) {
            if(word[i]==',' || word[i]=='.' || word[i]==' ') {
                sb.append(word[i]);
            }else if(word[i]>=65 && word[i]<=90 && word[i]+K>90) {
                sb.append((char) (64 + (word[i] + K-90)));
            }else if(word[i]>=97 && word[i]<=122 && word[i]+K>122) {
                sb.append((char) (96 + (word[i] + K-122)));
            }else {
                sb.append((char) (word[i] + K));
            }
        }
        System.out.println(sb.toString());
    }
}