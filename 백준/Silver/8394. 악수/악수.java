import java.util.*;
import java.io.*;

class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        //사람 수 N 입력
        int N = Integer.parseInt(br.readLine());
        
        //피보나치 활용하여 풀기, 초기값 선언
        int answer = 1;
        int index = 1;
        
        for(int i=2 ; i<=N ; i++){
            int tmp = answer;
            answer = (answer+index) % 10;
            index = tmp;
        }
        
        System.out.println(Integer.toString(answer));
    }
}