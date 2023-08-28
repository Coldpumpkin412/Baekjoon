import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        //그리디 활용하여 풀기
        Scanner sc = new Scanner(System.in);
        
        //끊어진 기타줄 수N, 기타줄 브랜드 수M 입력 및 최솟값 초기값선정
        int N = sc.nextInt();
        int M =sc.nextInt();
        int min = Integer.MAX_VALUE;
        
        //패키지가격 및 낱개가격배열 선언 후 값 입력
        int[] unit = new int[M];
        int[] pack = new int[M];
        for(int i=0 ; i<M ; i++){
            pack[i] = sc.nextInt();
            unit[i] = sc.nextInt();
        }
        
        //오름차순 정렬
        Arrays.sort(unit);
        Arrays.sort(pack);
       
        min = Math.min(((N/6)+1)*pack[0], N*unit[0]);    
        min = Math.min(min, ((N/6))*pack[0] + (N%6)*unit[0]);
        
        System.out.println(min);
    }
}
