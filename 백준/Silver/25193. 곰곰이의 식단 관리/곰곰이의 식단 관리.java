import java.util.*;
import java.io.*;

public class Main {
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st;
    	
    	int n = Integer.parseInt(br.readLine());
        String s = br.readLine();
        
        int count = 0;
        
        //치킨먹은날의 수 확인
        for (int i=0 ; i<s.length() ; i++) {
            if (s.charAt(i) == 'C'){
                count++;
            }
        }
        //C(치킨)의 개수를 C(치킨)이 아닌것의 개수로 나누어주기 *올림처리를위해 +1해주기
        System.out.println(count/(n-count+1) + (count%(n-count+1)!=0 ? 1 : 0));
    }
}	