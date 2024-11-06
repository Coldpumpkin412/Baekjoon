import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        //카드 수 입력
        int N = Integer.parseInt(br.readLine());
        
        //주언 카드
        int[] arr1 = new int[N]; 
        
        //사장님 카드
        int[] arr2 = new int[N];

        //주언 카드 입력
        st = new StringTokenizer(br.readLine());
        for(int i=0 ; i<N ; i++) {
            arr1[i] = Integer.parseInt(st.nextToken());
        }
        
        //사장님 카드 입력
        st = new StringTokenizer(br.readLine());
        for(int i=0 ; i<N ; i++) {
            arr2[i] = Integer.parseInt(st.nextToken());
        }

        //오름차순 정렬
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int count = 0;
        int index = 0;

        for(int i=0 ; i<N ; i++) {
            if(count >= (N+1)/2) {
                break; 
            }

            for(int j=index ; j<N ; j++) {
                if(arr1[i] < arr2[j]) {
                    count++;
                    index = j + 1;
                    break;
                }
            }

        }

        System.out.println(count>=(N+1) / 2 ? "YES" : "NO");
    }

}