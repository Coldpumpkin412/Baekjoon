import java.util.*;

public class Main {

    public static void main(String[] args) {
        /*
         * 배열의 가운데에 가장 긴 통나무를 두고 좌우로 퍼져나가며 그 다음 긴 통나무를 둔다.
         * 즉, 처음 주어지는 통나무 배열을 오름차순으로 정렬 후 순서대로 정답배열 좌,우에 넣어준다.
         */
        
        Scanner sc = new Scanner(System.in);
        
        //테스트 케이스 T 입력
        int T = sc.nextInt(); 
        
        while(T-->0) {
            //통나무 개수 N 입력 및 배열 선언
            int N = sc.nextInt();      
            int[] tree = new int[N];
            
            //통나무 길이 입력 후 오름차순 정렬
            for (int i=0 ; i<N ; i++) {
                tree[i] = sc.nextInt();
            }
            Arrays.sort(tree);
            
            int left = N - 1;
            int right = 0;
            int[] nums = new int[N];
            
            //인덱스가 짝수(0포함)면 배열의 오른쪽부터, 홀수면 왼쪽부터 채워넣기
            for(int i=0 ; i<N ; i++) {
                if(i%2 == 0) {
                    nums[left--] = tree[i];
                }else{
                    nums[right++] = tree[i];
                }
            }
            
            //인접한것들끼리의 크기비교
            int answer = Integer.MIN_VALUE;
            for (int i=1 ; i<N ; i++) {
                answer = Math.max(answer, Math.abs(nums[i]-nums[i-1]));
            }
            
            //처음과 끝 통나무도 크기비교
            answer = Math.max(answer,Math.abs(nums[0]-nums[N-1]));
            
            //결과출력
            System.out.println(answer + " ");
        }

    }
}