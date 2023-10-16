import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        //공백으로 분할하여 저장해주기
        String[] nums = br.readLine().split(" ");
        
        int s1 = Integer.parseInt(nums[0]);
        int s2 = Integer.parseInt(nums[1]);
        int s3 = Integer.parseInt(nums[2]);
        
        //결과배열
        int[] result = new int[s1 + s2 + s3 + 13];
        
        //초기값 100으로 결과배열 채워주기
        Arrays.fill(result, 100);
        
        for (int i=1 ; i<=s1 ; i++) {
            for (int j=1 ; j<=s2 ; j++) {
                for(int k=1 ; k<=s3 ; k++){
                    result[i + j + k]--;
                }
            }
        }
        
        //초기값 설정
        int min = 100;
        int index = -1;
        
        for(int i=0 ; i<result.length ; i++){
            if(min > result[i]){
                min = result[i];
                index = i;
            }
        }

        System.out.println(index);
    }
}