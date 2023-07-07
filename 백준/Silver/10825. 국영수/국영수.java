import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        
        String[][] arr = new String[N][4];
        for (int i=0 ; i<N ; i++) {
            arr[i] = br.readLine().split(" ");
        }
        
        //Comparator 사용 하여 조건부정렬
        Arrays.sort(arr, new Comparator<String[]>() {
            @Override
            public int compare(String[] s1, String[] s2) {
                if (Integer.parseInt(s1[1]) == Integer.parseInt(s2[1])) {
                    if (Integer.parseInt(s1[2]) == Integer.parseInt(s2[2])) {
                        if (Integer.parseInt(s1[3]) == Integer.parseInt(s2[3])) {
                            //국영수 점수가 같다면 사전 오름차순
                            return s1[0].compareTo(s2[0]);
                        }
                        //수학점수만 다르면 내림차순
                        return Integer.compare(Integer.parseInt(s2[3]), Integer.parseInt(s1[3]));
                    }
                    //국어점수가 같으면 영어 오름차순
                    return Integer.compare(Integer.parseInt(s1[2]), Integer.parseInt(s2[2]));
                }
                //국어점수는 내림차순
                return Integer.compare(Integer.parseInt(s2[1]), Integer.parseInt(s1[1]));
            }
        });
        
        for(int i=0 ; i<N ; i++) {
            System.out.println(arr[i][0]);
        }
    }
}
