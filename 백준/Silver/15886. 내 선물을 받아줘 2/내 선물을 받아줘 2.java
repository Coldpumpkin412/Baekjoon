import java.util.*;
import java.io.*;

public class Main {
    static Set<Integer> set = new HashSet<>();
    
    //DFS함수
    public static void DFS(int index, String str, boolean[] visited) {
        //이미 해시셋에 있으면 종료
        if(set.contains(index)){
            return;  
        } 
        
        //방문한적 있으면 해시셋에 넣어준 후 종료
        if(visited[index]) {
            set.add(index);
            return;
        }

        //방문처리
        visited[index] = true;
        
        //E인 경우 +1 후 재귀호출
        if(str.charAt(index)=='E'){
            DFS(index+1, str, visited);
        }else{
            DFS(index-1, str, visited);
        }
            
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        //골목길 길이 N 입력
        int N = Integer.parseInt(br.readLine());
        
        //구사과 지도 입력
        String input = br.readLine();

        for(int i=0 ; i<N ; i++) {
            //방문처리 배열 선언
            boolean[] visited = new boolean[N];
            
            //DFS함수
            DFS(i, input, visited);
        }

        System.out.println(set.size());
    }
}