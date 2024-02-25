import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        int T = Integer.parseInt(br.readLine());
        while(T-->0){
            int candy = 0;
            br.readLine();
            
            st = new StringTokenizer(br.readLine());
            int r = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            char[][] arr = new char[r][c];
            
            for(int i=0 ; i<r ; i++){    // 박스 내용물을 받아서 저장
                String box = br.readLine();
                for(int j=0 ; j<c ; j++){
                    arr[i][j] = box.charAt(j);
                }
            }
            for(int i=0 ; i<r ; i++){    // 사탕 모양이 제대로 만들어졌는지 확인하여 맞다면 사탕의 수 + 1
                for(int j=0 ; j<c ; j++){
                    if(j<c-2 && arr[i][j]=='>' && arr[i][j+1]=='o' && arr[i][j+2]=='<'){
                        candy++;
                    }
                    if(i<r-2 && arr[i][j]=='v' && arr[i+1][j]=='o' && arr[i+2][j]=='^'){
                        candy++;
                    }
                }
            }
            
            System.out.println(candy);
        }
    }
}