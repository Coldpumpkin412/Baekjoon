import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int N = Integer.parseInt(br.readLine());

        String[][] pairs = new String[N][2];

        for(int i=0 ; i<N ; i++) {
            String[] inputString = br.readLine().split(" ");
            pairs[i][0] = inputString[0]; 
            pairs[i][1] = inputString[1]; 
        }

        Arrays.sort(pairs, (o1, o2) -> {
            if (o1[0].compareTo(o2[0])==0) { 
                return o2[1].compareTo(o1[1]);
            }else {
                return o1[0].compareTo(o2[0]); 
            }
        });
        
        
        for(int i=0 ; i<N ; i++) {
            sb.append(pairs[i][0]).append(" ").append(pairs[i][1]).append("\n");
        }
        
        System.out.println(sb.toString());

    }
}