import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        if(N<100000 && N%2024==0){
            sb.append("Yes");
        }else{
            sb.append("No");
        }
        
        System.out.println(sb.toString());
    }
}