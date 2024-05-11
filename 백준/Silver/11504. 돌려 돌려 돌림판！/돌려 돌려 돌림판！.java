import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {        
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int T = Integer.parseInt(br.readLine());
        
        while(T-->0) {
            int count = 0;
            String[] input = br.readLine().split(" ");
            int N = Integer.parseInt(input[0]);
            int M = Integer.parseInt(input[1]);
            int X = Integer.parseInt(br.readLine().replaceAll(" ", ""));
            int Y = Integer.parseInt(br.readLine().replaceAll(" ", ""));
            String status = br.readLine().replaceAll(" ", "");
            
            int index = 0;
            for(int i=0 ; i<N ; i++) {
                while(i+M >= status.length()) {
                    status += status.charAt(index);
                    index++;
                }
                String reading = "";
                
                for(int j=i ; j<i+M ; j++) {
                    reading += Character.toString(status.charAt(j));
                }
                
                if(Integer.parseInt(reading)<=Y && Integer.parseInt(reading)>=X) {
                    count++;
                }
            }
            System.out.println(count);
        }
        
    }
}