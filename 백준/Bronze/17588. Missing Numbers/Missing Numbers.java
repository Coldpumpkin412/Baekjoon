import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        //N 입력
        int N = Integer.parseInt(br.readLine());
        
        //비교 배열
        boolean[] comp = new boolean[201];
        
        int last = 0;
        
        for(int i=0 ; i<N ; i++){
            //아이가 말한 숫장
            int num = Integer.parseInt(br.readLine());
            
            comp[num] = true;
            
            last = num;
        }
        
        boolean check = false;
        
        for(int i=1 ; i<=last ; i++){
            if(!comp[i]){
                sb.append(i).append("\n");
                check = true;
            }
        }
        
        if(!check){
            sb.append("good job");
        }
        
        System.out.println(sb.toString());
    }
}