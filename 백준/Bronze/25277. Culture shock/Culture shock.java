import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        //단어 수 N 입력
        int N = Integer.parseInt(br.readLine());
        
        //단어 저장할 배열 선언
        String[] word = new String[N];
        
        //비교군 선언
        String[] comp = {"he", "she", "him", "her"};
        
        int count = 0;
        
        //문장 입력
        st = new StringTokenizer(br.readLine());
        for(int i=0 ; i<N ; i++){
            word[i] = st.nextToken();
        }
        
        //비교
        for(int i=0 ; i<N ; i++){
            for(int j=0 ; j<4 ; j++){
                if(word[i].equals(comp[j])){
                    count++;
                }
            }
        }
        
        System.out.println(count);
    }
}