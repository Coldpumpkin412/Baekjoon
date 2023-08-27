import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //수열 크기N, 반복횟수K 입력
        int N = sc.nextInt();
        int K = sc.nextInt();
        
        int[] A = new int[N];//N개만큼 배열 생성
        String[] t = new String[N];
        
        //문자열 입력
        String str = sc.next();
        
        //, 기준으로 분할
        t = str.split(",");
        for(int i=0 ; i<A.length ; i++){
            A[i] = Integer.parseInt(t[i]);
        }
        for(int i=0 ; i<K ; i++) {
            for(int j=0 ; j<N-1 ; j++) {
                //점화식 활용
                A[j] = A[j+1]-A[j];
            }
        }
        
        for(int i=0 ; i<N-K ; i++) {
            System.out.print(A[i]);
            
            if(i!=N-K-1){
                System.out.print(',');
            }
        }
        
    }
}
