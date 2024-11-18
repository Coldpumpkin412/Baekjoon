import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        //N 입력
        int N = Integer.parseInt(br.readLine());
        
        for(int i=N ; i>=1 ; i--){
            for(int j=1 ; j<=i ; j++){
                System.out.print("*");
            }
            
            System.out.println();
        }
    }
}