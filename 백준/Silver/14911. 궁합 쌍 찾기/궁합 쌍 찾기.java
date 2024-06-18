import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        //2개이상 10개이하 정수 입력
        String[] str = br.readLine().split(" ");
        int[] arr = new int[str.length];
        
        //입력된 정수 배열에 넣기
        for(int i=0 ; i<str.length ; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }
        
        //배열 오름차순 정렬
        Arrays.sort(arr);
            
        //정수 1개 입력
        int index = Integer.parseInt(br.readLine());
        
        
        int count = 0;
        
        Set<String> set = new HashSet<>();
        
        for(int i=0 ; i<arr.length-1 ; i++) {
            for (int j=i+1 ; j<arr.length ; j++) {
                if (arr[i]+arr[j] == index) {
                    String num = arr[i] + " " + arr[j];
                    
                    //이미 포함돼있다면 무시
                    if(set.contains(num)) {
                        continue;
                    }
                    
                    set.add(num);
                    
                    sb.append(num).append('\n');
                    count++;
                }
            }
        }
        sb.append(count);
        
        System.out.println(sb.toString());
    }
}