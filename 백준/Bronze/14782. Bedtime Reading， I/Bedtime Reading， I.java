import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        //I 입력
        int I = Integer.parseInt(br.readLine());
        
        //약수 저장할 리스트 선언
        List<Integer> list = new ArrayList<>();
        
        for(int i=1 ; i*i<=I ; i++){
            //약수인 경우
            if(I%i == 0){
                //제곱근인 경우
                if(i*i == I){
                    list.add(i);
                    break;
                }else{
                    list.add(i);
                    list.add(I/i);
                }
            }
        }
        
        int answer = 0;
        
        for(int num : list){
            answer += num;
        }
        
        System.out.println(answer);
    }
}