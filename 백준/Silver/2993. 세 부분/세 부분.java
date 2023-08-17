import java.util.*;
import java.io.*; 

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
        //문자열 입력
        String str = br.readLine();
        
        //링크드리스트 선언
        List<String> list = new LinkedList<>();
        for (int i=2 ; i<str.length() ; i++) {
            for (int j=1 ; j<i ; j++) {
                //문자열 3부분으로 나눈 후 뒤집기
                StringBuilder strSb1 = new StringBuilder(str.substring(0, j));
                StringBuilder strSb2 = new StringBuilder(str.substring(j, i));
                StringBuilder strSb3 = new StringBuilder(str.substring(i));
                
                String str1 = strSb1.reverse().toString();
                String str2 = strSb2.reverse().toString();
                String str3 = strSb3.reverse().toString();
                
                //뒤집은 문자열들을 리스트에 넣어주기
                list.add(str1+str2+str3);
            }
        }
        //정렬 후 출력
        Collections.sort(list);
        System.out.println(list.get(0));

    }

}