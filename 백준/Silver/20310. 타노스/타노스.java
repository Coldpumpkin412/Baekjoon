import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        
        //S 입력
        String S = sc.nextLine();

        //0의개수, 1의개수
        int num0 = 0;
        int num1 = 0;

        for(int i=0 ; i<S.length() ; i++) {
            if(S.charAt(i)== '0') {
                num0 ++;
            }else {
                num1 ++;
            }
        }
        
        num0 /= 2;
        num1 /= 2;

        for(int i=0 ; i<num0 ; i++) {
            sb.append('0');
        }
        for(int i=0 ; i<num1 ; i++) {
            sb.append('1');
        }

        System.out.println(sb.toString());
    }
}