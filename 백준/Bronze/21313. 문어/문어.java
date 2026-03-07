import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int N = Integer.parseInt(br.readLine());       

        for(int i=0 ; i<N ; i++){
            if(i==N-1 && N%2==1){
                sb.append("3"); 
            }else{
                sb.append((i%2)+1).append(" ");
            }
        }

        System.out.println(sb.toString().trim());
    }
}
