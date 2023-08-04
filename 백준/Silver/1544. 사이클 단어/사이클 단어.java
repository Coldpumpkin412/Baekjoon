import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        //N입력 및 리스트배열 선언
        int N = Integer.parseInt(br.readLine());
        
        ArrayList<String>[] arr = new ArrayList[N];
        
        int result = 0;

        for (int i=0 ; i<N ; i++) {
            arr[i] = new ArrayList<>();
            
            String str = br.readLine();
            
            for(int j=0 ; j<str.length() ; j++){
                arr[i].add(str.substring(j)+ str.substring(0,j));
            }
    
            boolean chk = true;
            for (int j=0 ; chk && j<=i-1 ; j++) {
                for (int k=0 ; chk && k<arr[j].size() ; k++) {
                    if (str.equals(arr[j].get(k))) chk = false;
                }
            }
            if (chk)
                result++;
        }

        System.out.println(result);
    }
}