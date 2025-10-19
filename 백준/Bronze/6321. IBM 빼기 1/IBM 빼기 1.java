import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for(int i=1 ; i<=N ; i++) {
            String computerName = br.readLine();
            StringBuilder sb = new StringBuilder();

            for(char c : computerName.toCharArray()) {
                if(c == 'Z') {
                    sb.append('A');
                } else {
                    sb.append((char) (c + 1));
                }
            }

            System.out.println("String #" + i);
            System.out.println(sb.toString());
            
            if(i < N) {
                System.out.println();
            }
            
        }

    }
}