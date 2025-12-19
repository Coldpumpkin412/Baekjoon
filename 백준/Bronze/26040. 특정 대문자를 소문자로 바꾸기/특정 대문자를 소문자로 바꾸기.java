import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        String str = br.readLine();

        st = new StringTokenizer(br.readLine());
        while(st.hasMoreTokens()) {
            String word = st.nextToken();

            if(str.contains(word)) {
                str = str.replaceAll(word, word.toLowerCase());
            }
        }

        sb.append(str);
        
        System.out.println(sb.toString());
    }
}