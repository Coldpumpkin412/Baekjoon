import java.util.*;
import java.io.*;
 
public class Main {
   public static void main(String[] args) throws IOException {
       //해시셋 활용하여 풀기
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
      //N입력 후 해시셋 선언 
      int N = Integer.parseInt(br.readLine());
      Set<String> set = new HashSet<>();
      
      //문자열 배열 선언 및 값 이벽
      String[] input = new String[N];
      for (int i=0 ; i<N  ;i++) {
          input[i] = br.readLine();
      }
       
      int len = input[0].length();
 
      for (int k=1 ; k<=len ; k++) {
         //셋 내부에 문자열 자른 값 입력
         for (int i=0 ; i<N ; i++) {
            set.add(input[i].substring(len-k));
         }
         //길이가 초기입력(N)과 같아지면 순서 출력 후 종료
         if(set.size()==N){
            System.out.println(k);
            return;
         }
         set.clear();
      }
   }
}