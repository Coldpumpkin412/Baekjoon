import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        int[][] arr = new int[2][5];
        int[] point = {6, 3, 2, 1, 2};
        int[] sum = new int[2];

        for(int i=0 ; i<arr.length ; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0 ; j<arr[i].length ; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }       

        for(int i=0 ; i<arr.length ; i++) {
            for(int j=0 ; j<arr[i].length ; j++) {
                sum[i] += point[j]*arr[i][j]; 
            }
        }

        System.out.println(sum[0] + " " + sum[1]);
    }
}