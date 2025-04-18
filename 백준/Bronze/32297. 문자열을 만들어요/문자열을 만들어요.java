import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int length = Integer.parseInt(br.readLine());
        String str = br.readLine();
        
        if(str.contains("gori")){
            sb.append("YES");
        }else{
            sb.append("NO");
        }

        System.out.println(sb.toString());
    }
}