import java.util.*;
import java.io.*;

public class Main {        

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        //N, A, B 입력
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        
        //2x1, 2x2 타일 리스트 선언
        List<Integer> twoByOne = new ArrayList<>();
        List<Integer> twoByTwo = new ArrayList<>();
        
        //값 입력
        st = new StringTokenizer(br.readLine());
        for(int i=0 ; i<A ; i++) {
            twoByOne.add(Integer.parseInt(st.nextToken()));
        }
        
        st = new StringTokenizer(br.readLine());
        for(int i=0 ; i<B ; i++) {
            twoByTwo.add(Integer.parseInt(st.nextToken()));
        }

        //내림차순 정렬
        twoByOne.sort(Comparator.reverseOrder());
        twoByTwo.sort(Comparator.reverseOrder());

        int answer = 0;

        if(N%2 == 1) {
            answer += twoByOne.get(0);
            twoByOne.remove(0);
        }

        for(int i=0 ; i<N/2 ; i++) {
            int case1 = 0;
            int case2 = 0;
            
            if(twoByOne.size() >= 2) {
                case1 = twoByOne.get(0) + twoByOne.get(1);
            }
            if(twoByTwo.size() >= 1) {
                case2 = twoByTwo.get(0);
            }

            if(case1 > case2) {
                answer += case1;
                twoByOne.remove(0);
                twoByOne.remove(0);
            }else {
                answer += case2;
                twoByTwo.remove(0);
            }
        }

        System.out.println(answer);
    }
}