import java.util.*;
import java.io.*;

public class Main {
    private static char[] QUACK = {'q','u','a','c','k'};
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        //입력 문자열을 char 배열에 넣어주기
        char[] arr = br.readLine().toCharArray();
        
        //길이가 5의배수가 아니라면 -1 출력 후 종료
        if(arr.length%5 != 0) {
            System.out.println(-1);
            return;
        }
        
        int length = arr.length;
        
        int count = 0;
        
        while(length != 0) {
            int point = 0;
            int index = 0;
            
            boolean check = false;
            
            int[] tmp = new int[5];
            
            while(index < arr.length) {
                if(arr[index] == QUACK[point]) {
                    tmp[point++] = index;
                    
                    if(point == 5) {
                        check = true;
                        
                        length -= 5;
                        point = 0;
                        
                        for(int i=0 ; i<5 ; i++) {
                            arr[tmp[i]] = '\0';
                        }
                    }
                }
                
                index++;
            }
            if(check) {
                count++;
            }else {
                break;
            }
        }
        
        System.out.println(length==0 ? count : -1);
    }
}