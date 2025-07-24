import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int answer = 0;

        for(int i=0 ; i<4 ; i++) {
            String puzzle = br.readLine();

            for(int j=0 ; j<4 ; j++) {
                char cur = puzzle.charAt(j);

                if(cur == '.') {
                    continue;
                }

                int number = cur - 'A';

                int X = number / 4;
                int Y = number % 4;

                answer += Math.abs(i-X) + Math.abs(j-Y);
            }
        }

        System.out.println(answer);
    }
}