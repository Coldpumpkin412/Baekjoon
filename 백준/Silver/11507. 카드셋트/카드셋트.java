import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        //문자열 저장할 해시셋 선언
        HashSet<String> set = new HashSet<>();
        
        String str = br.readLine();
        
        int[] cnt = new int[4];
        for (int i=0 ; i<str.length() ; i+=3) {
            //3글자씩 쪼개기
            String cur = str.substring(i, i+3);
            
            //이미 있다면 출력 후 종료
            if(set.contains(cur)) {
                System.out.println("GRESKA");
                return;
            }
            
            set.add(cur);

            switch (cur.charAt(0)) {
                case 'P' : cnt[0]++; break;
                case 'K' : cnt[1]++; break;
                case 'H' : cnt[2]++; break;
                case 'T' : cnt[3]++; break;
            }
        }

        
        for (int i=0 ; i<4 ; i++) {
            sb.append(13-cnt[i]).append(' ');
        }
        
        System.out.println(sb);
    }
}