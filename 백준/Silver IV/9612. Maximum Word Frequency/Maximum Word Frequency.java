import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        //N 입력 
        int N = Integer.parseInt(br.readLine());
        
        Map<String, Integer> map = new HashMap<>();
        
        int max = 0;
        String maxStr = "";
        
        while(N-->0) {
            String cur = br.readLine();
            
            map.put(cur, map.getOrDefault(cur, 0)+1);
            
            if(max < map.get(cur)) {
                max = map.get(cur);
                maxStr = cur;
            }else if(max==map.get(cur) && maxStr.compareTo(cur)<0) {
                maxStr = cur;
            }
        }
        
        System.out.println(String.format("%s %d", maxStr, max));
    }
}