import java.util.*;
 
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        //학생 수 N 입력
        int N = sc.nextInt();
        
        String arr[][] = new String[N][4];
         
        //생년월일 정보 입력
        for (int i=0 ; i<N ; i++) {
            arr[i][0] = sc.next();
            arr[i][1] = sc.next();
            arr[i][2] = sc.next();
            arr[i][3] = sc.next();
        }
         
        //순서대로 연, 월, 일 기준으로 정렬한다(오름차순)
        Arrays.sort(arr, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                if (Integer.parseInt(o1[3]) == Integer.parseInt(o2[3])) {
                    if (Integer.parseInt(o1[2]) == Integer.parseInt(o2[2])) {
                        return Integer.compare(Integer.parseInt(o1[1]), Integer.parseInt(o2[1]));
                    } else
                        return Integer.compare(Integer.parseInt(o1[2]), Integer.parseInt(o2[2]));
                }
                return Integer.compare(Integer.parseInt(o1[3]), Integer.parseInt(o2[3]));
            }
        });
         
        //가장 나이가 적은사람과 나이가 많은사람 출력
        System.out.println(arr[N-1][0]+"\n"+arr[0][0]);
    }
}
 