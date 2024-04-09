import java.util.*;
import java.io.*;

public class Main {

    static int[] B;
    static int check;
    
    //퀵소트
    public static void quick_sort(int[] A, int left, int right){

        if(left >= right) return;
        if(check == 1) return;

        int part2 = partition(A, left, right);

        quick_sort(A, left, part2-1);
        quick_sort(A, part2+1, right);
    }
    
    //파티션 함수
    public static int partition(int[] A, int left, int right){
        int lo = left;
        int hi = right;
        
        //피벗값
        int pivot = A[right];

        while(lo < hi){
            //피벗값보다 큰 값을 찾을때까지 시작점 인덱스 이동
            while(lo<hi && A[lo]<pivot){
                lo++;
            }
            //피벗값보다 작은 값을 찾을때까지 끝점 인덱스 이동
            while(lo < hi && A[hi]>=pivot){
                hi--;
            }
            
            //교환 후 비교
            swap(A, lo, hi);
            compare(A); 
        }
        
        //교환 후 비교
        swap(A, hi, right);
        compare(A);
        return hi;
    }
    
    //교환함수
    public static void swap(int[] A, int i, int j){
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
    
    //비교함수
    public static boolean compare(int[] A){
        for(int i=0 ; i<A.length ; i++){
            if(A[i] != B[i]){
                return false;
            }
        }
        
        check = 1;
        return true;
    }
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        int N = Integer.parseInt(br.readLine());
        int[] A = new int[N];
        B = new int[N];
        
        check = 0;

        st = new StringTokenizer(br.readLine());
        for(int i=0 ; i<N ; i++){
            A[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for(int i=0 ; i<N ; i++){
            B[i] = Integer.parseInt(st.nextToken());
        }

        compare(A);
        quick_sort(A, 0, N - 1);

        System.out.println(check);
    }
}