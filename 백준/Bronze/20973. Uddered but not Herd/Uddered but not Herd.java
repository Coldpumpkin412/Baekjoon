import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String cowStr = sc.nextLine();
        String target = sc.nextLine();
        
        int count = 0;    //answer

        int index = 0;    //target 전용 idx

        while(index < target.length()){
            ++count;
            
            for(int i=0 ; i<cowStr.length() ; i++) {
                if(cowStr.charAt(i) == target.charAt(index)) {
                    ++index;
                }
                if(index >= target.length()) {
                    break;
                }
            }
        }

        System.out.println(count);

    }
}