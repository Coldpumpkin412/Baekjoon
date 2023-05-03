import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        //무한루프
        while(true) {
            String word = scan.next();
            //*을 만나면 브레이크 후 나오기
            if (word.equals("*")) break;
            
            boolean flag = true;
            
            for (int i=0 ; i<word.length()-1 ; i++) {
                List<String> list = new ArrayList<String>();
                HashSet<String> set = new HashSet<String>();
                                        
                for (int j=0 ; j<word.length()-i-1 ; j++) {
                    String pair_string = "" + word.charAt(j) + word.charAt(j+i+1);
                    list.add(pair_string);
                    set.add(pair_string);
                }
                
                if (list.size() != set.size()) {
                    flag = false;
                    //체크변수 false 후 for문 빠져나가기
                    break;
                }
                
                //리스트와 셋 초기화
                list.clear();
                set.clear();
                    
            }
            
            if (flag) 
                System.out.println(word + " is surprising.");
            else
                System.out.println(word + " is NOT surprising.");
            
        }
 
    }
 
}