import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //n입력
        int n = sc.nextInt();
        
        //해시셋 선언
        Set<String> set = new HashSet<>();

        for(int i=0 ; i<n ; i++){
            String str = sc.next();
            
            //입력된 문자열 char 배열로 바꾸기
            char[] word = str.toCharArray();
            
            //오름차순 정렬
            Arrays.sort(word);
            
            set.add(Arrays.toString(word));
        }
        
        System.out.println(set.size());
    }
}