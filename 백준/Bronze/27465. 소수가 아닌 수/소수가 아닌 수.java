import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        while(true){
            int index = (int)Math.sqrt(N);
            
            boolean check = false;

            for(int i=2 ; i<=index ; i++) {
                if(N%i == 0){
                    check = true;
                    break;
                }
            }

            if(check){
                sb.append(N);
                break;
            }

            N++;
        }

        System.out.println(sb.toString());
    }
}