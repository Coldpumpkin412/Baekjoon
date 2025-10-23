import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int V = Integer.parseInt(br.readLine());
        
        String str = br.readLine();

        int countA = 0;
        
        for(char result : str.toCharArray()) {
            if(result == 'A') {
                countA++;
            }
        }

        String answer = "Tie";
        
        if(V < countA * 2) {
            answer = "A";
        }else if (V > 2*countA) {
            answer = "B";
        }

        System.out.print(answer);
    }
}