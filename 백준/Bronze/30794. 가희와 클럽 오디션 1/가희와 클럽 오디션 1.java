import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        //키 노트의 lv과 판정 입력
        st = new StringTokenizer(br.readLine());
        int lv = Integer.parseInt(st.nextToken());
        String str = st.nextToken();
        
        if(str.equals("miss")){
            System.out.println(0);
        }else if(str.equals("bad")){
            System.out.println(lv * 200);
        }else if(str.equals("cool")){
            System.out.println(lv * 400);
        }else if(str.equals("great")){
            System.out.println(lv * 600);
        }else{
            System.out.println(lv * 1000);
        }
    }
}