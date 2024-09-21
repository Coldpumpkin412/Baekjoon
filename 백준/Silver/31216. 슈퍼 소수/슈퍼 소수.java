import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[]args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
        List<Integer> list = new ArrayList<>();
        int[] num=new int[318138];
        num[1] = 1;
        
        for(int i=2 ; i<318138 ; i++){
            if(num[i] == 1){
                continue;
            }
            
            for(int j=i+i ; j<318138 ; j+=i){
                num[j] = 1;
            }
        }

        int k=1;
        
        for(int i=2 ; i<318138 ; i++){
            if(num[i] == 0){
                if(num[k] == 0){
                    list.add(i);
                }
                k++;
            }
        }

        int N = Integer.valueOf(br.readLine());
        while(N-->0){
            int Q = Integer.parseInt(br.readLine());
            System.out.println(list.get(Q-1));
        }
    }
}