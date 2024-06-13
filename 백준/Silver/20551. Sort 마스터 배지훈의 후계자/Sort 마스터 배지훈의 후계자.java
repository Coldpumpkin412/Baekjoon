import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));        
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        //원소의 개수 N, 질문의 개수 M 입력
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());  
                
        //배열 A값 입력
        int[] arrA = new int[N];
        for(int i=0 ; i<N ; i++){
            arrA[i] = Integer.parseInt(br.readLine());
        }
        
        //오름차순 정렬
        Arrays.sort(arrA);

        //해시맵 선언(key : 배열값, value : 순서)
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i=0 ; i<N ; i++){
            if(!map.containsKey(arrA[i])){
                map.put(arrA[i], i);
            }
        }
        
        //M개의 질문
        while(M-->0){
            //정수 D 입력
            int D = Integer.parseInt(br.readLine());
            
            //정수 D를 key로 갖고있으면 그 위치를, 아니면 -1을 저장
            if(map.containsKey(D)) {
                sb.append(map.get(D)).append("\n");    
            }else {
                sb.append(-1).append("\n");
            }
                
        }

        //출력
        System.out.println(sb.toString());        
    }
}